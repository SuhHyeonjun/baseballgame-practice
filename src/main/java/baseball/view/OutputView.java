package baseball.view;

public class OutputView {
    private static final int ZERO = 0;

    public void printResult(int strikeCount, int ballCount) {
        if (strikeCount == ballCount && strikeCount > ZERO) {
            System.out.println(strikeCount + Message.STRIKE.getMessage());
        }
        if (strikeCount == ZERO && ballCount > ZERO) {
            System.out.println(ballCount + Message.BALL.getMessage());
        }
        if (strikeCount > ZERO && ballCount - strikeCount > ZERO) {
            System.out.print((ballCount - strikeCount) + Message.BALL.getMessage());
            System.out.println(strikeCount + Message.STRIKE.getMessage());
        }
        if (strikeCount == ZERO && ballCount == ZERO) {
            System.out.println(Message.NOTHING.getMessage());
        }
    }

    public void printTotalCount(int gameCount) {
        System.out.print(Message.GAME_ATTEMPTS.getMessage() + gameCount);
    }
}
