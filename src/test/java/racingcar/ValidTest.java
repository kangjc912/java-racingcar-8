package racingcar;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidTest {
    @Test
    void 이름이_5자_이상이면_예외() {

        String names = "pobi, woni, javajigi";

        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test

    void 자동차_이름에_공백이면_예외() {
        String EmptyName = "pobi,,woni";
        String BlankName = "pobi, ,woni";
        assertThatThrownBy(()-> Validator.validateCarNames(EmptyName))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> Validator.validateCarNames(BlankName))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test

    void 입력값이_비어있거나_쉼표로_끝나면_예외() {
        // given
        String emptyInput = "";
        String blankInput = "   ";
        String endsWithComma = "pobi,woni,";
        String nullInput = null;

        assertThatThrownBy(() -> Validator.validateCarNames(emptyInput))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> Validator.validateCarNames(blankInput))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> Validator.validateCarNames(endsWithComma))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> Validator.validateCarNames(nullInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test

    void 시도_횟수가_숫자가_아니면_예외() {
        // given
        String notNumber = "a";
        String blank = " ";
        String empty = "";
        String notInteger = "1.5";

        assertThatThrownBy(() -> Validator.validateTryCount(notNumber))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> Validator.validateTryCount(blank))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> Validator.validateTryCount(empty))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> Validator.validateTryCount(notInteger))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test

    void 시도_횟수가_1_미만이면_예외() {

        String zero = "0";
        String negative = "-1";

        assertThatThrownBy(() -> Validator.validateTryCount(zero))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> Validator.validateTryCount(negative))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
