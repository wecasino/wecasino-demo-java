package com.wecasino.demo;

import com.wecasino.proto.games.FlowSeat;
import com.wecasino.proto.games.ResourceType;
import com.wecasino.proto.recorder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class RouletteRoundProcessor implements RoundProcessor {

    private static final Logger logger =
            LoggerFactory.getLogger(RouletteRoundProcessor.class);

    RoundParser roundParser = new RoundParser();

    public void ProcessRound(RoundRecord round, GameNotifyType notifyType) {
        logger.info("Roulette process round: {}  game {} round {}", notifyType, round.getGameCode(), round.getRoundCode());

        roundParser.VerifyRound(round);

        switch (notifyType) {
            case NOTIFY_ROUND_START:
                processRoundStart(round);
                break;
            case NOTIFY_ROUND_BET:
                processRoundBet(round);
                break;
            case NOTIFY_ROUND_NO_MORE_BET:
                processRoundNoMoreBet(round);
                break;
            case NOTIFY_ROUND_STEP:
                processRoundStep(round);
                break;
            case NOTIFY_ROUND_FINISH:
                processRoundFinish(round);
                break;
            case NOTIFY_ROUND_CANCEL:
                processRoundCancel(round);
                break;
        }
    }

    public void processRoundStart(RoundRecord round) {
        //state: start 開始局

    }

    public void processRoundBet(RoundRecord round) {
        //state: start bet 開始下注

        Step step = roundParser.GetLastStepOfCode(round, com.wecasino.proto.games.roulette.Step.ROUND_BET.getNumber());
        //倒數秒數 step.getDuration()
        //開始下注時間 step.getTimestamp()

        //新增遊戲局記錄
        //開始倒數並定時更新betpool

    }

    public void processRoundNoMoreBet(RoundRecord round) {
        //state: stop bet 停止下注

        Step step = roundParser.GetLastStepOfCode(round, com.wecasino.proto.games.roulette.Step.NO_MORE_BET.getNumber());
        //停止下注時間 step.getTimestamp()

        //更新遊戲局狀態
    }

    public void processRoundStep(RoundRecord round) {
        //state: card 發牌
        Step step = roundParser.GetCurrentStep(round);
        if (step.getCode() == com.wecasino.proto.games.roulette.Step.ROUND_START.getNumber()) {
            return;
        }

        String roundCard = parseRoundCards(round);  //遊戲結果, format ROULETTE_1
        Map<String, Long> fortuneRatesMap = round.getFortuneRatesMap(); //財神倍率
        fortuneRatesMap.forEach((k, v) ->  {
            //k 號碼 0-36, v 倍率
        });
        
        //更新遊戲局狀態, 卡牌資料

    }

    public void processRoundFinish(RoundRecord round) {
        //state: result 確認發牌
        Step step = roundParser.GetCurrentStep(round);
        //局結算時間 step.getTimestamp()

        String roundCard = parseRoundCards(round);  //遊戲結果, format ROULETTE_1
        Map<String, Long> fortuneRatesMap = round.getFortuneRatesMap(); //財神倍率
        fortuneRatesMap.forEach((k, v) ->  {
            //k 號碼 0-36, v 倍率
        });

        //更新遊戲局狀態, 卡牌資料
        //更新路紙, 好路計算
        //結算當局投注
    }

    public void processRoundCancel(RoundRecord round) {
        //state: cancel 取消局

        if (!round.getCancel()) {
            throw new RuntimeException("game round not cancel");
        }

        //取消原因代碼 round.getCancelCode()
        //取消備註 round.getCancelMessage()

        //更新遊戲局狀態
        //更新路紙
        //取消該局投注

    }

    //result format: ROULETTE_1 (ROULETTE_0 - ROULETTE_36)
    String parseRoundCards(RoundRecord round) {
        Map<Integer, Seat> seats = round.getSeatsMap();
        Seat dealer = seats.get(FlowSeat.DEALER.getNumber());
        if (dealer != null) {
            CardList fieldCards = dealer.getCardsMap().get(ResourceType.FIELD.getNumber());
            if (fieldCards != null) {
                Card card = fieldCards.getList(0);
                return card.getCode();
            }
        }
        return "";
    }

}
