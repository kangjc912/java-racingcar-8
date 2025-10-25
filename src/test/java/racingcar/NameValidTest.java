package racingcar;


import javax.xml.validation.Validator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameValidTest {
    @Test
    void 이름이_5자_이상이면_예외() {

        String names = "pobi, woni, javajigi";

        assertThatThrownBy(() -> NameValidator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test

    void 자동차_이름에_공백이면_예외() {
        String EmptyName = "pobi,,woni";

        assertThatThrownBy(()->NameValidator.validateCarNames(EmptyName))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
