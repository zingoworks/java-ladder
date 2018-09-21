package com.zingoworks.laddergame;

import com.zingoworks.laddergame.domain.Ladder;
import com.zingoworks.laddergame.view.InputView;
import com.zingoworks.laddergame.view.ResultView;

public class LadderMain {
    public static void main(String[] args) {
        String[] nameOfPeople = InputView.inputPeople();
        int maxLadderHeight = InputView.inputMaxLadder();

        Ladder ladder = new Ladder(nameOfPeople, maxLadderHeight);

        ResultView.printResult(ladder);
    }
}
