package com.wecasino.demo;

import com.wecasino.proto.recorder.GameNotifyType;
import com.wecasino.proto.recorder.RoundRecord;

public interface RoundProcessor {

    void ProcessRound(RoundRecord round, GameNotifyType notifyType);

    void processRoundStart(RoundRecord round);

    void processRoundBet(RoundRecord round);

    void processRoundNoMoreBet(RoundRecord round);

    void processRoundStep(RoundRecord round);

    void processRoundFinish(RoundRecord round);

    void processRoundCancel(RoundRecord round);

}
