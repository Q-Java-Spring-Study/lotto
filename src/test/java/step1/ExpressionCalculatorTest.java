package step1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import step1.domain.Calculator;
import step1.view.input.EmptyInputValidator;
import step1.view.input.FormatValidator;
import step1.view.input.TokenSequenceValidator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExpressionCalculatorTest {

    @Test
    void 여러_연산을_순차적으로_수행() {
        assertThat(Calculator.calculate("2 + 2 + 6")).isEqualTo(10);
    }

    @Test
    void 다양한_사칙연산을_순차적으로_수행() {
        assertThat(Calculator.calculate("2 + 2 * 6 / 5")).isEqualTo(4);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", ""})
    void 입력_값이_null_또는_빈_공백_오류(String input) {
        EmptyInputValidator emptyInputValidator = new EmptyInputValidator();
        assertThatThrownBy(() -> emptyInputValidator.validate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0+5", "05963 + 6-1"})
    void 입력_값이_요청_포멧과_다름(String input) {
        FormatValidator formatValidator = new FormatValidator();
        assertThatThrownBy(() -> formatValidator.validate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2 + 2 -", "2 + + 5 - /"})
    void 입력_값의_홀수_순번에는_숫자가_위치하며_총_문자열의_개수는_홀수(String input) {
        TokenSequenceValidator tokenSequenceValidator = new TokenSequenceValidator();
        assertThatThrownBy(() -> tokenSequenceValidator.validate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
