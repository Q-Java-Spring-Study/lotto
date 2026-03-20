package step1.view.input;

import step1.common.StringUtils;
import step1.constans.ErrorMessage;

import java.util.List;

public class TokenSequenceValidator implements Validator {
    @Override
    public void validate(String input) {
        List<String> tokens = StringUtils.split(input, " ");

        // 리스트는 항상 홀수
        if(tokens.size() % 2 == 0){
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_FORMAT.getMessage());
        }

        // 짝수는 숫자인지 확인
        for (int i = 0; i < tokens.size(); i+=2) {
            if(!isEvenIndexNumber(tokens.get(i))){
                throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_FORMAT.getMessage());
            }
        }
    }

    private boolean isEvenIndexNumber(String token){
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
