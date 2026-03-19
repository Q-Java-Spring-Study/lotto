package step1.domain;

import java.util.Arrays;

public enum ArithmeticOperation {
    ADD("+") {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public int calculate(int a, int b) {
            return roundDown(a / b);
        }
    };

    private final String symbol;

    ArithmeticOperation(String symbol) {
        this.symbol = symbol;
    }

    public abstract int calculate(int a, int b);

    public static ArithmeticOperation fromString(String inputSymbol) {
        return Arrays.stream(ArithmeticOperation.values())
                .filter(operation -> operation.symbol.equals(inputSymbol))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid operation symbol: " + inputSymbol));
    }

    public int roundDown(int number){
        return (int) Math.floor(number);
    }
}
