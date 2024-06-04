package com.wecasino.demo;

import com.google.protobuf.InvalidProtocolBufferException;
import com.rabbitmq.client.Channel;
import com.wecasino.proto.games.GameType;
import com.wecasino.proto.recorder.GameNotifyType;
import com.wecasino.proto.recorder.RoundRecord;
import com.wecasino.proto.recorder.GameProvide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.Date;
import java.util.Map;

@SpringBootApplication
public class DemoApplication  {

	private static final Logger logger = 
    LoggerFactory.getLogger(DemoApplication.class);

	private static final String WECA_QUEUE = "yx-uat";
	private static final String WECA_EXCHANGE = "game-exchange";
	private static final Duration WECA_CATCHUP_PERIOD = Duration.ofMinutes(3);

	private final BaccartRoundProcessor baccartRoundProcessor = new BaccartRoundProcessor();
    private final SicboRoundProcessor sicboRoundProcessor = new SicboRoundProcessor();
    private final RouletteRoundProcessor rouletteRoundProcessor = new RouletteRoundProcessor();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RabbitListener(
		bindings = @QueueBinding(
			value = @Queue(value = WECA_QUEUE, durable = "true", autoDelete = "false", exclusive = "false"),
			exchange = @Exchange(value = WECA_EXCHANGE, autoDelete = "false"),
			arguments = {
					@Argument(name = "x-match", value = "any"),
					@Argument(name = "platform", value = "true")
			}),
		ackMode = "MANUAL"	
	)
	// 所有遊戲通知都會透過這個方法進行處理
	// 每一個通知處理完後，需要透過 channel.basicAck() 來確認處理完畢
	// 如果處理失敗，則透過 channel.basicNack() 來重新處理
	// 這個方法裡不能有long running task，否則會導致rabbitmq channel被佔用，無法接收新的訊息, 進而導致遊戲端延遲
	// 可以透過添加channel pool size或跑多個instance(docker, k8s)來解決性能問題
	public void listen(Message msg, Channel channel) {
		try {

			var now = new Date();
			var msgType = msg.getMessageProperties().getType();
			var msgTs = msg.getMessageProperties().getTimestamp();
//			logger.info("Received msg hdr: " + now);
//			logger.info("Received msgTs hdr: " + msgTs);

			var msgNeedCatchup = Duration.between(msgTs.toInstant(), now.toInstant()).compareTo(WECA_CATCHUP_PERIOD) > 0;

			var msgHdr = Map.of(
				"msgType", msgType,
				"msgTs", String.valueOf(msgTs.toInstant().toEpochMilli()),
				"msgRedelivered", String.valueOf(msg.getMessageProperties().getRedelivered()),
				"msgRoutingKey", msg.getMessageProperties().getReceivedRoutingKey(),
				"msgNeedCatchup", String.valueOf(msgNeedCatchup)
			);

			logger.info("Received msg hdr: " + msgHdr);

			if (msgNeedCatchup) {
				logger.warn("Message is too old, need to handle fast forward");
			}

			logger.info("Received message type: " + msgType);

			if (msgType.equals(GameNotifyType.NOTIFY_GAME_PROVIDE_STATE_CHANGE.name())) {
				// 遊戲開啟或維護
				// GameProvide protoProviderMsg = GameProvide.newBuilder().mergeFrom(msg.getBody()).build();
			} else if (msgType.equals(GameNotifyType.NOTIFY_GAME_DEALER_LOGIN.name())) {
				processProvider(msg.getBody(),GameNotifyType.NOTIFY_GAME_DEALER_LOGIN);
				// 荷官登入
				// GameProvide protoProviderMsg = GameProvide.newBuilder().mergeFrom(msg.getBody()).build();
			} else if (msgType.equals(GameNotifyType.NOTIFY_GAME_DEALER_LOGOUT.name())) {
				// 荷官登出
			} else if (msgType.equals(GameNotifyType.NOTIFY_GAME_CHANGING_SHOE.name())) {
				// 換靴
			} else if (msgType.equals(GameNotifyType.NOTIFY_SHIFT_START.name())) {
				// 換班
			} else if (msgType.equals(GameNotifyType.NOTIFY_SHIFT_END.name())) {
				// 換班結束
			} else if  (msgType.equals(GameNotifyType.NOTIFY_SHOE_START.name())) {
				processShoe(msg.getBody(), GameNotifyType.NOTIFY_SHOE_START);
			} else if  (msgType.equals(GameNotifyType.NOTIFY_SHOE_END.name())) {
				processShoe(msg.getBody(), GameNotifyType.NOTIFY_SHOE_END);
			} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_START.name())) {
				 processRound(msg.getBody(), msgNeedCatchup, GameNotifyType.NOTIFY_ROUND_START);
			} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_BET.name())) {
				 processRound(msg.getBody(), msgNeedCatchup, GameNotifyType.NOTIFY_ROUND_BET);
            } else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_NO_MORE_BET.name())) {
			 	 processRound(msg.getBody(), msgNeedCatchup, GameNotifyType.NOTIFY_ROUND_NO_MORE_BET);
			} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_STEP.name())) {
				 processRound(msg.getBody(), msgNeedCatchup, GameNotifyType.NOTIFY_ROUND_STEP);
			} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_FINISH.name())) {
				 processRound(msg.getBody(), msgNeedCatchup, GameNotifyType.NOTIFY_ROUND_FINISH);
			} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_CANCEL.name())) {
				 processRound(msg.getBody(), msgNeedCatchup, GameNotifyType.NOTIFY_ROUND_CANCEL);
			} else {
				logger.warn("unhandled message type: " + msgType);
			}

			// Acknowledge the message after processing
			channel.basicAck(msg.getMessageProperties().getDeliveryTag(), false);
			
		} catch (Exception e) {
			logger.error("Failed to process message", e);

			try {
				channel.basicNack(msg.getMessageProperties().getDeliveryTag(), false, true);
			} catch (Exception e2) {
				logger.error("Failed to nack message", e2);
			}
		}
	}

	protected void processProvider(byte[] data, GameNotifyType notifyType) throws InvalidProtocolBufferException {
		GameProvide round = GameProvide.newBuilder().mergeFrom(data).build();
	}

	protected void processShoe(byte[] data, GameNotifyType notifyType) throws InvalidProtocolBufferException {

	}

    protected void processRound(byte[] data, boolean msgNeedCatchup, GameNotifyType notifyType) throws InvalidProtocolBufferException {
        RoundRecord round = RoundRecord.newBuilder().mergeFrom(data).build();

        String gameType = round.getGameType();
        if (gameType.equals(GameType.BACCARAT.name())) {
            // handle BACCARAT
			baccartRoundProcessor.ProcessRound(round, notifyType);
        } else if (gameType.equals(GameType.LUCKYWHEEL.name())) {
            //handle LUCKYWHEEL
        } else if (gameType.equals(GameType.SICBO.name())) {
            //handle SICBO
            sicboRoundProcessor.ProcessRound(round, notifyType);
		} else if (gameType.equals(GameType.ROULETTE.name())) {
            //handle ROULETTE
            rouletteRoundProcessor.ProcessRound(round, notifyType);
        }

        if (!msgNeedCatchup) {
            //Notify 遊戲端
        }

    }

}
