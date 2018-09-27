package com.zingoworks.laddergame;

import com.zingoworks.laddergame.domain.Ladder;
import com.zingoworks.laddergame.view.InputView;
import com.zingoworks.laddergame.view.ResultView;

public class LadderMain {
    public static void main(String[] args) {
        String[] nameOfPeople = InputView.inputPeople();
        int maxLadderHeight = InputView.inputMaxLadder();
        String[] valueOfLadder = InputView.inputResultValueOfLadder();

        Ladder ladder = new Ladder(nameOfPeople, maxLadderHeight, valueOfLadder);

        ResultView.printResult(ladder);
        String personToCheck = InputView.inputPersonToCheck();
        ResultView.printCheckResult (ladder, nameOfPeople, personToCheck);
    }
}