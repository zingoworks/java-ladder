package com.zingoworks.laddergame.view;

import java.util.Scanner;

public class InputView {
    static final String COMMA = ",";
    static final int NAMELENGTHLIMIT = 5;

    static Scanner sc = new Scanner(System.in);

    public static String[] inputPeople () {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return nameLengthException(sc.nextLine().split(COMMA));
    }

    public static String[] inputResultValueOfLadder () {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        return sc.next().split(COMMA);
    }

    public static int inputMaxLadder () {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return sc.nextInt();
    }

    public static String inputPersonToCheck () {
        System.out.println("결과를 보고 싶은 사람은?");
        return sc.next();
    }

    private static String[] nameLengthException (String[] names) {
        for (int i = 0; i < names.length; i++) {
            names = nameLengthError(names, names[i]);
        }
        return names;
    }

    private static String[] nameLengthError(String[] names, String name) {
        if (name.length() > NAMELENGTHLIMIT) {
            System.out.println("<경고> 이름의 최대길이는 5자 입니다.");
            names = inputPeople();
        }
        return names;
    }
}
