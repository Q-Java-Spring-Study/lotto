package step1.view.input;

import java.util.List;

public class InputValidator {

    // 추가 되는 문자열 벨리데이션 정보를 모아서 사용
    private static final List<Validator> validators = List.of(
            new EmptyInputValidator(),
            new FormatValidator(),
            new TokenSequenceValidator()
    );

    private InputValidator(){}

    public static void validateAll(String input){
        for (Validator validator : validators) {
            validator.validate(input);
        }
    }
}
