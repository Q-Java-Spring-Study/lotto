package step1.constans;

public enum ErrorMessage implements FormattableMessage {
    EMPTY_INPUT("No input was provided."),
    INVALID_INPUT_FORMAT("The input format is invalid. Please follow the required format."),
    INVALID_EXPRESSION_FORMAT("The expression format is invalid. Please enter it correctly."),
    INVALID_OPERATOR("Invalid operation symbol: %s");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
