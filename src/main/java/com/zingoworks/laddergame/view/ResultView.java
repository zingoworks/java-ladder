package com.zingoworks.laddergame.view;

import com.zingoworks.laddergame.domain.Ladder;

public class ResultView {

    static final String HORIZON = "|";
    static final String DASH = "-";
    static final String BLANK = " ";


    public static void printResult (int numOfPeople, int maxLadderHeight) {
        for (int i = 0; i < maxLadderHeight; i++) {
            printAllLine(numOfPeople);
        }
    }

    private static void printAllLine(int numOfPeople) {
        printHorizon();
        for (int i = 0; i < numOfPeople - 1; i++) {
            Ladder l = new Ladder(numOfPeople);
            printOneLine(l.ladder[i]);
        }
        System.out.println("");
    }

    private static void printOneLine (Boolean b) {
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
