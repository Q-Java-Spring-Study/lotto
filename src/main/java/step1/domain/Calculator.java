package step1.domain;

import step1.common.StringUtils;
import step1.domain.constans.ArithmeticOperation;
import step1.view.input.InputValidator;
import step1.view.output.ConsoleMessageView;

import java.util.List;
import java.util.Scanner;

public class Calculator {

    static final Scanner scanner = new Scanner(System.in);

    private Calculator(){}

    public static int startCalculation(){
        while (true) {
            try {
                ConsoleMessageView.printInputExpression();
                String input = scanner.nextLine().trim();

                InputValidator.validateAll(input);

                return calculate(input);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int calculate(String input){
        List<String> expression = StringUtils.split(input, " ");
        int result = Integer.parseInt(expression.get(0));
        for(int i = 1; i < expression.size(); i+=2){
            ArithmeticOperation operation = ArithmeticOperation.fromString(expression.get(i));
            result = operation.calculate(result, Integer.parseInt(expression.get(i+1)));
        }

        return result;
    }

    public static void scannerClose(){
        scanner.close();
    }
}
