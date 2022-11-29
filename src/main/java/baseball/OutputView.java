package baseball;

import java.util.List;
import java.util.Objects;

public class OutputView {
    private static final int NUMBER_SIZE = 3;

    public void printResult(List<Integer> computerNumbers, List<Integer> playerNumber) {
        printStrike(computerNumbers, playerNumber);
        printBall(computerNumbers, playerNumber);
        printNothing(computerNumbers, playerNumber);
    }

    public void printStrike(List<Integer> computerNumbers, List<Integer> playerNumber) {
        int strikeCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (Objects.equals(computerNumbers.get(i), playerNumber.get(i))) {
                strikeCount++;
            }
        }
        System.out.println(strikeCount + Message.STRIKE.getMessage());
    }

    public void printBall(List<Integer> computerNumbers, List<Integer> playerNumber) {
        int ballCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (computerNumbers.contains(playerNumber.get(i))) {
                ballCount++;
            }
        }
        System.out.println(ballCount + Message.BALL.getMessage());
    }

    public void printNothing(List<Integer> computerNumbers, List<Integer> playerNumber) {
        computerNumbers.retainAll(playerNumber);
        if (computerNumbers.size() == 0) {
            System.out.println(Message.NOTHING.getMessage());
        }
    }
}
