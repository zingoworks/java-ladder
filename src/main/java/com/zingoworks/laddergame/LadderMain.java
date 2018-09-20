package com.zingoworks.laddergame;

import com.zingoworks.laddergame.view.InputView;
import com.zingoworks.laddergame.view.ResultView;

public class LadderMain {
    public static void main(String[] args) {
        int numOfPeople = InputView.inputPeople();
        int maxLadderHeight = InputView.inputMaxLadder();

        ResultView.printResult(numOfPeople, maxLadderHeight);
    }
}
