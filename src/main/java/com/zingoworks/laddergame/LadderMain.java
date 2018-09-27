package com.zingoworks.laddergame;

import com.zingoworks.laddergame.domain.Ladder;
import com.zingoworks.laddergame.view.InputView;
import com.zingoworks.laddergame.view.ResultView;

public class LadderMain {
    /*
    1. Step3 피드백으로 예외처리함수 구현해봤습니다.
    2. Test코드 제외하고 Step5의 기능구현 먼저 러프하게 해봤습니다.

    일단 기능구현 후 클래스 및 코드 정리를 해보려고 했는데,
    5단계 힌트를 보니 매우... 구조적으로 제 코드와 차이가 나보여서
    참고하며 재구현 해보려는데 어떨까요?
    (DTO, Override, 클래스 세분화)
     */

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