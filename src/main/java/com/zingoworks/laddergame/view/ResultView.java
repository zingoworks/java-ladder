package com.zingoworks.laddergame.view;

import com.zingoworks.laddergame.domain.Ladder;

public class ResultView {
    static final String HORIZON = "|";
    static final String LADDERLINE = "-----";
    static final String LADDERBLANK = "     ";

    public static void printResult (Ladder l) {
        printNames(l);
        printLines(l);
    }

    private static void printNames(Ladder l) {
        for (int i = 0; i < l.getNumOfPeople(); i++) {
            System.out.print(l.getNames().get(i));
        }
        System.out.println("");
    }

    private static void printLines(Ladder l) {
        for (int i = 0; i < l.getMaxLadderHeight(); i++) {
            System.out.print(LADDERBLANK);
            printHorizon();
            printOneLine(l, i);
            System.out.println("");
        }
    }

    private static void printOneLine(Ladder l, int i) {
        for (int j = 0; j < l.getNumOfPeople()- 1; j++) {
            printOneSet(l.getLines().get(i).getBooleanInfo(j));
        }
    }

    private static void printOneSet(Boolean b) {
        printVertical(b);
        printHorizon();
    }

    private static void printHorizon () {
        System.out.print(HORIZON);
    }

    private static void printVertical (Boolean b) {
        if (b == true) {
            System.out.print(LADDERLINE);
            return;
        }
        System.out.print(LADDERBLANK);
    }
}
