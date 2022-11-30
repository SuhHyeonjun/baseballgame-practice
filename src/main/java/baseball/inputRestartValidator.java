package baseball;

public class inputRestartValidator {

    public static void validateInputRestart(String input) {
        validateInputSize(input);
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
            throw new IllegalArgumentException(ErrorMessage.INPUT_RANGE.getErrorMessage());
        }
    }
}
