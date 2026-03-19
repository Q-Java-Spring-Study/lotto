package step1.view.input;

import java.util.Scanner;

public class InputValidator {
    static final Scanner scanner = new Scanner(System.in);

    private InputValidator(){}

    public static boolean isValid(String input){
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("empty input");
        }
        return true;
    }
}
