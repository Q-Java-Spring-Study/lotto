package step1.constans;

public enum ConsoleMessage implements FormattableMessage {
    INPUT_EXPRESSION("Please enter an expression with spaces between numbers and operators (e.g., 1 + 2 + 3)."),
    RESULT_VALUE("Result: %S");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
