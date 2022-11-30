package baseball.validator;

import baseball.view.ErrorMessage;

public class inputRestartValidator {

    public static void validateInputRestart(String input) {
        validateInputBlank(input);
        validateInputSize(input);
        validateInputType(input);
        validateInputRange(input);
    }

    private static void validateInputSize(String input) {
        if (input.length() != 1) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_RESTART_LENGTH.getErrorMessage());
        }
    }

    private static void validateInputRange(String input) {
        String regex = "[1-2]+";
        if (!input.matches(regex)) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_ONE_OR_TWO.getErrorMessage());
        }
    }

    private static void validateInputType(String input) {
        String regex = "^[0-9]*$";
        if (!input.matches(regex)) {
            throw new NumberFormatException(ErrorMessage.INPUT_TYPE.getErrorMessage());
        }
    }

    private static void validateInputBlank(String input) {
        if (input.equals(" ")) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_BLANK.getErrorMessage());
        }
    }
}
