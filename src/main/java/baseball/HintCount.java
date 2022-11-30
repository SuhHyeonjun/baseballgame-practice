package baseball;

import java.util.List;
import java.util.Objects;

public class HintCount {
    private static final int NUMBER_SIZE = 3;
    private static int strikeCount = 0;
    private static int ballCount = 0;

    public static void getHintCount(List<Integer> computerNumbers, List<Integer> playerNumber) {
        getStrike(computerNumbers, playerNumber);
        getBall(computerNumbers, playerNumber);
    }

    public static void initCount() {
        strikeCount = 0;
        ballCount = 0;
    }

    private static void getStrike(List<Integer> computerNumbers, List<Integer> playerNumber) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (Objects.equals(computerNumbers.get(i), playerNumber.get(i))) {
                strikeCount++;
            }
        }
    }

    private static void getBall(List<Integer> computerNumbers, List<Integer> playerNumber) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (computerNumbers.contains(playerNumber.get(i))) {
                ballCount++;
            }
        }
    }

    public static int getStrikeCount() {
        return strikeCount;
    }

    public static int getBallCount() {
        return ballCount;
    }
}
