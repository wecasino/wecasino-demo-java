package com.wecasino.demo;

import com.wecasino.proto.recorder.RoundRecord;
import com.wecasino.proto.recorder.Step;

public class RoundParser {

    public void VerifyRound(RoundRecord round) {
        if (round == null || round.getGameCode().isEmpty() || round.getShiftCode().isEmpty() || round.getRoundCode().isEmpty()) {
            throw new RuntimeException("invalid round");
        }
    }

    public long ShoeNoFromShoeCode(String shoeCode) {
        if (shoeCode.length() == 28) {
            String roundShoeStr = shoeCode.substring(24);
            return Long.parseLong(roundShoeStr);
        }
        return 0;
    }

    public long ShiftNoFromCode(String shiftCode) {
        if (shiftCode.length() == 24) {
            String roundShiftStr = shiftCode.substring(20);
            return Long.parseLong(roundShiftStr);
        }
        return 0;
    }

    public Step GetCurrentStep(RoundRecord round) {
        if (!round.getProcessList().isEmpty()) {
            return round.getProcessList().getLast();
        }
        return null;
    }

    public Step GetLastStepOfCode(RoundRecord round, int stepCode) {
        for (var i = round.getProcessList().size() - 1; i >= 0; i--) {
            if (round.getProcess(i).getCode() == stepCode) {
                return round.getProcess(i);
            }
        }
        return null;
    }

}
