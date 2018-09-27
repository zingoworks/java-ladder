package com.zingoworks.laddergame.view;

import com.zingoworks.laddergame.domain.Ladder;

public class ResultView {
    static final String HORIZON = "|";
    static final String LADDERLINE = "-----";
    static final String LADDERBLANK = "     ";

    public static void printResult (Ladder l) {
        System.out.println("사다리 결과");
        printNames(l);
        printLines(l);
        printValues(l);
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

    private static void printValues(Ladder l) {
        for (int i = 0; i < l.getNumOfPeople(); i++) {
            System.out.print(l.getValues().get(i));
        }
        System.out.println("");
    }


    public static void printCheckResult (Ladder l, String[] nameOfPeople, String personToCheck) {
        System.out.println("실행결과");

        if (personToCheck.equals("all")) {
            for (int i = 0; i < nameOfPeople.length; i++) {
                System.out.println(nameOfPeople[i] + " : " + l.valueOfLadder[l.getValuesPosition()[i]]);
            }
            return;
        }

        int num = 0;
        for (int i = 0; i < nameOfPeople.length; i++) {
            if(nameOfPeople[i].equals(personToCheck)) {
                num = i;
            }
        }

        System.out.println(l.valueOfLadder[l.getValuesPosition()[num]]);
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
