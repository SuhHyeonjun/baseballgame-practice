package baseball;

import java.util.List;

public class OutputView {
    private static final int NUMBER_SIZE = 3;

    public void printStrike(List<Integer> computerNumbers, List<Integer> playerNumber) {
        int strikeCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (computerNumbers.get(i) == playerNumber.get(i)) {
                strikeCount++;
            }
        }
        System.out.println(strikeCount + Message.STRIKE.getMessage());
    }
}
