package step1.domain;

import java.util.List;

public class Calculator {

    private Calculator(){}

    public static int calculate(List<String> expression){
        int result = Integer.parseInt(expression.get(0));

        for(int i = 1; i < expression.size(); i+=2){
            ArithmeticOperation operation = ArithmeticOperation.fromString(expression.get(i));
            result = operation.calculate(result, Integer.parseInt(expression.get(i+1)));
        }

        return result;
    }
}
