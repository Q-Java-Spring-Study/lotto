package step1.view.input;

import step1.constans.ErrorMessage;

public class EmptyInputValidator implements Validator {

    @Override
    public void validate(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_INPUT.getMessage());
        }
    }
}
