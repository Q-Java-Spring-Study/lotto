package step1.view.input;

import step1.constans.ErrorMessage;

public class FormatValidator implements Validator {

    private static final String BASIC_PATTERN = "^[0-9]+( \\S [0-9]+)*$";

    @Override
    public void validate(String input) {
        if (!input.matches(BASIC_PATTERN)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_FORMAT.getMessage());
        }
    }
}
