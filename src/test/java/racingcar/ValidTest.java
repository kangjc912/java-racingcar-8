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

    void 입력값이_비어있거나_쉼표로_끝나면_예외() { // 새로 추가 (한글 이름)
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
}
