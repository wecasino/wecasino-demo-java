package com.wecasino.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Argument;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wecasino.proto.recorder.*;
import com.wecasino.proto.games.*;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner  {

	private static final Logger logger = 
    LoggerFactory.getLogger(DemoApplication.class);

	private static final String WECA_QUEUE = "yx-uat";
	private static final String WECA_EXCHANGE = "game-exchange";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

	@RabbitListener(
		bindings = @QueueBinding(
			value = @Queue(value = WECA_QUEUE, durable = "false", autoDelete = "true", exclusive = "false"),
			exchange = @Exchange(value = WECA_EXCHANGE, autoDelete = "false"),
			arguments = {
					@Argument(name = "x-match", value = "any"),
					@Argument(name = "platform", value = "true")
			}),
		ackMode = "manual"	
	)

	public void listen(Message msg) {

		String msgType = msg.getMessageProperties().getType();

		if (msgType.equals(GameNotifyType.NOTIFY_GAME_PROVIDE_STATE_CHANGE.name())) {
			//processGameProvide
		} else if (msgType.equals(GameNotifyType.NOTIFY_GAME_DEALER_LOGIN.name())) {

		} else if (msgType.equals(GameNotifyType.NOTIFY_GAME_DEALER_LOGOUT.name())) {

		} else if (msgType.equals(GameNotifyType.NOTIFY_GAME_CHANGING_SHOE.name())) {

		} else if (msgType.equals(GameNotifyType.NOTIFY_SHIFT_START.name())) {
			processShift(msg.getBody(), GameNotifyType.NOTIFY_SHOE_START);
		} else if (msgType.equals(GameNotifyType.NOTIFY_SHIFT_END.name())) {
			processShift(msg.getBody(), GameNotifyType.NOTIFY_SHOE_START);
		} else if  (msgType.equals(GameNotifyType.NOTIFY_SHOE_START.name())) {
			processShoe(msg.getBody(), GameNotifyType.NOTIFY_SHOE_START);
		} else if  (msgType.equals(GameNotifyType.NOTIFY_SHOE_END.name())) {
			processShoe(msg.getBody(), GameNotifyType.NOTIFY_SHOE_END);
		} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_START.name())) {
			processRound(msg.getBody(), GameNotifyType.NOTIFY_ROUND_START);
		} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_BET.name())) {
			processRound(msg.getBody(), GameNotifyType.NOTIFY_ROUND_BET);
		} else if  (msgType.equals(GameNotifyType.ROUND_NO_MORE_BET.name())) {
			processRound(msg.getBody(), GameNotifyType.ROUND_NO_MORE_BET);
		} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_STEP.name())) {
			processRound(msg.getBody(), GameNotifyType.NOTIFY_ROUND_STEP);
		} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_FINISH.name())) {
			processRound(msg.getBody(), GameNotifyType.NOTIFY_ROUND_FINISH);
		} else if  (msgType.equals(GameNotifyType.NOTIFY_ROUND_CANCEL.name())) {
			processRound(msg.getBody(), GameNotifyType.NOTIFY_ROUND_CANCEL);
		} else {
			logger.error("Unknown message type: " + msgType);
		}
	}

	protected void processShift(byte[] data, GameNotifyType notifyType) {

	}

	protected void processShoe(byte[] data, GameNotifyType notifyType) {

	}

	protected void processRound(byte[] data, GameNotifyType notifyType) {
		try{
			RoundRecord round = RoundRecord.newBuilder().mergeFrom(data).build();

			String gameType = round.getGameType();

			if (gameType.equals(GameType.BACCARAT.name())) {

			} else if (gameType.equals(GameType.LUCKYWHEEL.name())) {
				//handle LUCKYWHEEL
			}

		} catch (Exception e) {
			logger.error("Failed to parse round record", e);
		}
	}

}
