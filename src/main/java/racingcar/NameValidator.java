package racingcar;

public class NameValidator {

    private static final int MAX_NAME_LENGTH = 5;
    private static final String DELIMITER = ",";

    public static void validateCarNames(String input) {
        String[] names = input.split(DELIMITER);

        for (String name : names) {
            validateNameLength(name.trim());
        }
    }

    private static void validateNameLength(String name) {

        if(name.isEmpty()) {
            throw new IllegalArgumentException("이름이 공백일 수는 없습니다");
        }


        if (name.length() > MAX_NAME_LENGTH) { // indent 1
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");

        }


    }
}
