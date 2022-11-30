package baseball;

import java.util.Arrays;

public class inputRestartValidator {

    public static void validateInputRestart(String input) {
        validateInputSize(input);
    }

    private static void validateInputSize(String input) {
        if (input.length() != 1) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_RESTART_LENGTH.getErrorMessage());
        }
    }

}
