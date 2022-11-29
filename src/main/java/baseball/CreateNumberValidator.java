package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateNumberValidator {

    public static void validateComputerNumberDuplicate(List<Integer> computerNumbers) {
        Set<Integer> duplicateCheck = new HashSet<>(computerNumbers);
        if (computerNumbers.size() != duplicateCheck.size()) {
            throw new IllegalStateException(ErrorMessage.CREATE_NUMBER_DUPLICATE.getErrorMessage());
        }
    }

    public static void validateComputerNumberRange(List<Integer> computerNumbers) {
        for (int number : computerNumbers) {
            if (!(number >= 1 && number <= 9)) {
                throw new IllegalStateException(ErrorMessage.CREATE_NUMBER_RANGE.getErrorMessage());
            }
        }
    }
}
