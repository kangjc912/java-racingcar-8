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

        for (String name : names) {
            validateName(name.trim());
        }

    }

    private static void validateName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }

        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }


    public static int validateTryCount(String input) {
        int tryCount;
        try {
            tryCount = Integer.parseInt(input);
        } catch (NumberFormatException e) {

            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }

        validatePositiveTryCount(tryCount);

        return tryCount;
    }

    private static void validatePositiveTryCount(int tryCount) {
        if (tryCount <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상의 정수여야 합니다.");
        }
    }
}
