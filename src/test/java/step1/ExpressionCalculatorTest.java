package step1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import step1.domain.Calculator;
import step1.view.input.InputValidator;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExpressionCalculatorTest {

    @Test
    void 여러_연산을_순차적으로_수행() {
        List<String> expression = List.of("2", "+", "2", "+", "6");
        assertThat(Calculator.calculate(expression)).isEqualTo(10);
    }

    @Test
    void 다양한_사칙연산을_순차적으로_수행() {
        List<String> expression = List.of("2", "+", "2", "*", "6", "/", "5");
        assertThat(Calculator.calculate(expression)).isEqualTo(4);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", ""})
    void 입력_값이_null_또는_빈_공백_오류(String input) {
        assertThatThrownBy(() -> InputValidator.isValid(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
