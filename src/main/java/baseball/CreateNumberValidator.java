package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateNumberValidator {
    private static final Computer computer = new Computer();

    public static void validateDuplicate() {
        List<Integer> computerNumbers = computer.createRandomNumbers();
        Set<Integer> duplicateCheck = new HashSet<>(computerNumbers);
        if (computerNumbers.size() != duplicateCheck.size()) {
            throw new IllegalStateException(ErrorMessage.CREATE_NUMBER_DUPLICATE.getErrorMessage());
        }
    }
}
