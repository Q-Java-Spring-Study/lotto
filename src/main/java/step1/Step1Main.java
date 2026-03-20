package step1;

import step1.domain.Calculator;
import step1.view.output.ConsoleMessageView;

public class Step1Main {
    public static void main(String[] args) {
        int result = Calculator.startCalculation();

        ConsoleMessageView.printResult(result);

        Calculator.scannerClose();
    }
}
