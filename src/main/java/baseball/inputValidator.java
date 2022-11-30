package baseball;

import java.util.Arrays;

public class inputValidator {

    public static void validateInputDuplicate(String input) {
        String[] duplicateCheck = input.split("");
        long size = Arrays.stream(duplicateCheck).distinct().count();
        if (duplicateCheck.length != size) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_DUPLICATE.getErrorMessage());
        }
    }
}
