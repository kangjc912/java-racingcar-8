package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMove implements Move {

    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 9;
    private static final int MOVE_THRESHOLD = 4;


    public boolean MoveOrNot() {

        int randomNumber = Randoms.pickNumberInRange(MIN_NUM, MAX_NUM);


        return randomNumber >= MOVE_THRESHOLD;
    }
}
