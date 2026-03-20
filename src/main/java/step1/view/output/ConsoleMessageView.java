package step1.view.output;

import step1.constans.ConsoleMessage;

public class ConsoleMessageView {
    private ConsoleMessageView(){}

    public static void printInputExpression() {
        System.out.println(ConsoleMessage.INPUT_EXPRESSION.getMessage());
    }

    public static void printResult(int result) {
        System.out.println(ConsoleMessage.RESULT_VALUE.getFormatMessage(result));
    }
}
