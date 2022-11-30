package baseball;

import java.util.Arrays;

public class inputNumberValidator {

    public static void validateInputNumber(String input) {
        validateInputDuplicate(input);
        validateInputSize(input);
        validateInputType(input);
        validateInputRange(input);
    }

    private static void validateInputDuplicate(String input) {
        String[] duplicateCheck = input.split("");
        long size = Arrays.stream(duplicateCheck).distinct().count();
        if (duplicateCheck.length != size) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_DUPLICATE.getErrorMessage());
        }
    }

    private static void validateInputSize(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_LENGTH.getErrorMessage());
        }
    }

    private static void validateInputRange(String input) {
        String regex = "[1-9]+";
        if (!input.matches(regex)) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_RANGE.getErrorMessage());
        }
    }

    private static void validateInputType(String input) {
        String regex = "^[0-9]*$";
        if (!input.matches(regex)) {
            throw new NumberFormatException(ErrorMessage.INPUT_TYPE.getErrorMessage());
        }
    }
}
