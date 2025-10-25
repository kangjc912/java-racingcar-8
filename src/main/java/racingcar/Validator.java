package racingcar;

public class Validator {

    private static final int MAX_NAME_LENGTH = 5;
    private static final String DELIMITER = ",";



    public static void validateCarNames(String input) {

        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
        }

        if (input.endsWith(DELIMITER)) {
            throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
        }

        String[] names = input.split(DELIMITER);

        if (names.length == 0) {
            throw new IllegalArgumentException("입력값이 올바르지 않습니다.");
        }

        for (String name : names) { // indent 1
            validateName(name.trim());
        }

    }



    private static void validateName(String name) {
        if (name.isEmpty()) { // indent 1
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }

        if (name.length() > MAX_NAME_LENGTH) { // indent 1
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
