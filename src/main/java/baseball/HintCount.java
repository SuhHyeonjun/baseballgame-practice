package baseball;

import java.util.List;
import java.util.Objects;

public class HintCount {
    private static final int NUMBER_SIZE = 3;
    private int strikeCount = 0;
    private int ballCount = 0;

    public void getHintCount(List<Integer> computerNumbers, List<Integer> playerNumber) {
        getStrike(computerNumbers, playerNumber);
        getBall(computerNumbers, playerNumber);
    }

    public void initCount() {
        strikeCount = 0;
        ballCount = 0;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    private void getStrike(List<Integer> computerNumbers, List<Integer> playerNumber) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (Objects.equals(computerNumbers.get(i), playerNumber.get(i))) {
                strikeCount++;
            }
        }
    }

    private void getBall(List<Integer> computerNumbers, List<Integer> playerNumber) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (computerNumbers.contains(playerNumber.get(i))) {
                ballCount++;
            }
        }
    }
}
