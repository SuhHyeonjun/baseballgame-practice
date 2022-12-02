package baseball2.domain;

import static baseball2.validator.CreateNumberValidator.validateComputerNumberDuplicate;
import static baseball2.validator.CreateNumberValidator.validateComputerNumberRange;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {
    private static final int NUMBER_SIZE = 3;
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;

    public List<Integer> createRandomNumbers() {
        Set<Integer> duplicateRemover = new HashSet<>(NUMBER_SIZE);
        while (duplicateRemover.size() < NUMBER_SIZE) {
            int randomNumbers = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
            duplicateRemover.add(randomNumbers);
        }
        List<Integer> computerNumbers = new ArrayList<>(duplicateRemover);
        validateComputerNumberDuplicate(computerNumbers);
        validateComputerNumberRange(computerNumbers);
        return computerNumbers;
    }
}
