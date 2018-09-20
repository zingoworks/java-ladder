package com.zingoworks.laddergame.view;

import com.zingoworks.laddergame.domain.Ladder;

public class ResultView {
    static final String HORIZON = "|";
    static final String DASH = "-";
    static final String BLANK = " ";

    public static void printResult (int numOfPeople, int maxLadderHeight) {
        Ladder l = new Ladder(numOfPeople, maxLadderHeight);
        Ladder[] ladders = l.makeLadders();
        for (int i = 0; i < maxLadderHeight; i++) {
            printOneLadder(numOfPeople, ladders[i]);
        }
    }

    private static void printOneLadder(int numOfPeople, Ladder ladder) {
        printHorizon();
        for (int j = 0; j < numOfPeople - 1; j++) {
            printLine(ladder.ladderValue[j]);
        }
        System.out.println("");
    }

    private static void printLine (Boolean b) {
        printVertical(b);
        printHorizon();
    }

    private static void printHorizon () {
        System.out.print(HORIZON);
    }

    private static void printVertical (Boolean b) {
        if (b == true) {
            System.out.print(DASH);
            return;
        }
        System.out.print(BLANK);
    }
}
