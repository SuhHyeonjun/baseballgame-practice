package baseball;

import java.util.List;
import java.util.Objects;

public class OutputView {
    private static final int NUMBER_SIZE = 3;
    private int strikeCount = 0;
    private int ballCount = 0;

    public void printResult(List<Integer> computerNumbers, List<Integer> playerNumber) {
        printStrike(computerNumbers, playerNumber);
        printBall(computerNumbers, playerNumber);
        if (strikeCount == ballCount) {
            System.out.println(strikeCount + Message.STRIKE.getMessage());
        }
        if (strikeCount == 0 && ballCount > 0) {
            System.out.println(ballCount + Message.BALL.getMessage());
        }
        if (strikeCount > 0 && ballCount > 0) {
            System.out.print((ballCount - strikeCount) + Message.BALL.getMessage());
            System.out.println(strikeCount + Message.STRIKE.getMessage());
        }
        printNothing(computerNumbers, playerNumber);
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

    private void printNothing(List<Integer> computerNumbers, List<Integer> playerNumber) {
        computerNumbers.retainAll(playerNumber);
        if (computerNumbers.size() == 0) {
            System.out.println(Message.NOTHING.getMessage());
        }
    }
}
