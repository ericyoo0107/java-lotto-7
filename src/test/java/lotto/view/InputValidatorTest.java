package lotto.view;

import lotto.constants.ErrorCode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputValidatorTest {
    private final InputValidator inputValidator = new InputValidator();

    @DisplayName("입력 된 String 타입의 돈이 숫자가 아닌 경우 예외 발생.")
    @Test
    void parseMoneyTest() {
        // given
        String money = "유준혁킹왕짱";
        // when // then
        assertThatThrownBy(() -> inputValidator.parseMoney(money))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ErrorCode.MONEY_TYPE_ERROR.getMessage());
    }
}
