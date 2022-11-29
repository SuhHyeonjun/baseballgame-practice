package baseball;

import java.util.List;
import java.util.Objects;

public class OutputView {
    private static final int NUMBER_SIZE = 3;
    private static final int ZERO = 0;
    private int strikeCount = 0;
    private int ballCount = 0;

    public void printResult(List<Integer> computerNumbers, List<Integer> playerNumber) {
        printStrike(computerNumbers, playerNumber);
        printBall(computerNumbers, playerNumber);
        if (strikeCount == ballCount && strikeCount > ZERO) {
            System.out.println(strikeCount + Message.STRIKE.getMessage());
        }
        if (strikeCount == ZERO && ballCount > ZERO) {
            System.out.println(ballCount + Message.BALL.getMessage());
        }
        if (strikeCount > ZERO && ballCount > ZERO) {
            System.out.print((ballCount - strikeCount) + Message.BALL.getMessage());
            System.out.println(strikeCount + Message.STRIKE.getMessage());
        }
        if (strikeCount == ZERO && ballCount == ZERO) {
            System.out.println(Message.NOTHING.getMessage());
        }
    }

    private void printStrike(List<Integer> computerNumbers, List<Integer> playerNumber) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (Objects.equals(computerNumbers.get(i), playerNumber.get(i))) {
                strikeCount++;
            }
        }
    }

    private void printBall(List<Integer> computerNumbers, List<Integer> playerNumber) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (computerNumbers.contains(playerNumber.get(i))) {
                ballCount++;
            }
        }
    }
}
