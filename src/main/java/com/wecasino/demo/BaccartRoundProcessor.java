package com.wecasino.demo;

import com.wecasino.proto.games.FlowSeat;
import com.wecasino.proto.games.baccarat.ResourceType;
import com.wecasino.proto.recorder.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class BaccartRoundProcessor implements RoundProcessor {

    private static final Logger logger =
            LoggerFactory.getLogger(BaccartRoundProcessor.class);

    RoundParser roundParser = new RoundParser();

    public void ProcessRound(RoundRecord round, GameNotifyType notifyType) {
//        logger.info("bac process round: {}  game {} round {}", notifyType, round.getGameCode(), round);

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

        Step step = roundParser.GetLastStepOfCode(round, com.wecasino.proto.games.sicbo.Step.ROUND_BET.getNumber());
        //倒數秒數 step.getDuration()
        //開始下注時間 step.getTimestamp()

        //新增遊戲局記錄
        //開始倒數並定時更新betpool

    }

    public void processRoundNoMoreBet(RoundRecord round) {
        //state: stop bet 停止下注

        Step step = roundParser.GetLastStepOfCode(round, com.wecasino.proto.games.sicbo.Step.NO_MORE_BET.getNumber());
        //停止下注時間 step.getTimestamp()

        //更新遊戲局狀態
    }

    public void processRoundStep(RoundRecord round) {
        //state: card 發牌
        Step step = roundParser.GetCurrentStep(round);
        logger.info("bac current step process step code: {} , codeName{}", step.getCode()); // games.baccarat.Step

        if (step.getCode() == com.wecasino.proto.games.baccarat.Step.ROUND_START.getNumber()) {
            return;
        }

        String[] roundBankerCard = parseBankerRoundCards(round);  //遊戲結果, format ["CLUB_1","CLUB_2","CLUB_3"]
        String[] roundPlayerCard = parsePlayerRoundCards(round);  //遊戲結果, format ["CLUB_1","CLUB_1","CLUB_1"]

        logger.info("bac current Card process step playerCard: {},bankerCard: {}",roundPlayerCard,roundBankerCard); // games.baccarat.Step

        Map<String, Long> fortuneRatesMap = round.getFortuneRatesMap(); //財神倍率

        //更新遊戲局狀態, 卡牌資料

    }

    public void processRoundFinish(RoundRecord round) {
        //state: result 確認發牌
        Step step = roundParser.GetCurrentStep(round);
        //局結算時間 step.getTimestamp()

        String[] roundBankerCard = parseBankerRoundCards(round);  //遊戲結果, format DICE_1-DICE_2-DICE_3
        String[] roundPlayerCard = parsePlayerRoundCards(round);  //遊戲結果, format DICE_1-DICE_2-DICE_3
        Map<String, Long> fortuneRatesMap = round.getFortuneRatesMap(); //財神倍率
        fortuneRatesMap.forEach((k, v) ->  {
            //k 3骰總和 3-18, v 倍率
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

    //result format: []
    public String[] parseBankerRoundCards(RoundRecord round) {
        List<String> cardList = new ArrayList<>();
        Map<Integer, Seat> seats = round.getSeatsMap();
        Seat banker = seats.get(FlowSeat.BANKER.getNumber());
        if (banker != null) {
            CardList normalFieldCards = banker.getCardsMap().get(ResourceType.NORMAL.getNumber());
            if (normalFieldCards != null) {

                if (normalFieldCards.getListCount() > 0 ){
                    Card card = normalFieldCards.getList(0);    // 例牌1
                    cardList.add(card.getCode().toString());
                }
                if (normalFieldCards.getListCount() > 1 ){
                    Card card2 = normalFieldCards.getList(1);   // 例牌2
                    cardList.add(card2.getCode().toString());
                }
            }

            CardList extraFieldCards = banker.getCardsMap().get(ResourceType.EXTRA.getNumber());
            if (extraFieldCards != null) {
                if (extraFieldCards.getListCount() > 0 ){
                    Card card = extraFieldCards.getList(0);   // 額外牌1
                    cardList.add(card.getCode().toString());
                }
            }
        }

        return cardList.toArray(new String[0]);
    }

    public String[] parsePlayerRoundCards(RoundRecord round) {
        List<String> cardList = new ArrayList<>();
        Map<Integer, Seat> seats = round.getSeatsMap();
        Seat player = seats.get(FlowSeat.PLAYER.getNumber());
        if (player != null) {
            CardList normalFieldCards = player.getCardsMap().get(ResourceType.NORMAL.getNumber());
            if (normalFieldCards != null) {

                if (normalFieldCards.getListCount() > 0 ){
                    Card card = normalFieldCards.getList(0);    // 例牌1
                    cardList.add(card.getCode().toString());
                }
                if (normalFieldCards.getListCount() > 1 ){
                    Card card2 = normalFieldCards.getList(1);   // 例牌2
                    cardList.add(card2.getCode().toString());
                }
            }

            CardList extraFieldCards = player.getCardsMap().get(ResourceType.EXTRA.getNumber());
            if (extraFieldCards != null) {
                if (extraFieldCards.getListCount() > 0 ){
                    Card card = extraFieldCards.getList(0);   // 額外牌1
                    cardList.add(card.getCode().toString());
                }
            }
        }

        return cardList.toArray(new String[0]);
    }

}
