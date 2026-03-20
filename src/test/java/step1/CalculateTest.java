package step1;

import org.junit.jupiter.api.Test;
import step1.domain.constans.ArithmeticOperation;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculateTest {

    @Test
    void 연산자_찾기() {
        ArithmeticOperation operation = ArithmeticOperation.fromString("+");
        assertThat(operation).isEqualTo(ArithmeticOperation.ADD);
    }

    @Test
    void 연산자_찾기_실패() {
        assertThatThrownBy(() -> ArithmeticOperation.fromString("="))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 더하기() {
        int result = ArithmeticOperation.ADD.calculate(1, 9);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void 빼기() {
        int result = ArithmeticOperation.SUBTRACT.calculate(1, 9);
        assertThat(result).isEqualTo(-8);
    }

    @Test
    void 곱하기() {
        int result = ArithmeticOperation.MULTIPLY.calculate(1, 9);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void 나누기() {
        int result = ArithmeticOperation.DIVIDE.calculate(1, 9);
        assertThat(result).isEqualTo(0);
    }

}
