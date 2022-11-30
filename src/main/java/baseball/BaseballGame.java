package baseball;

import java.util.List;

public class BaseballGame {
    private static final Computer computer = new Computer();
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();
    private static final HintCount hintCount = new HintCount();
    private int strikeCount;
    private int ballCount;
    private static boolean status = true;

    public void start() {
        System.out.println(Message.START_GAME.getMessage());
        List<Integer> computerNumbers = computer.createRandomNumbers();
        do {
            System.out.println(computerNumbers);
            List<Integer> playerNumber = inputView.inputNumber();
            hintCount.getHintCount(computerNumbers, playerNumber);
            applyHintCount();
            outputView.printResult(strikeCount, ballCount);
            endGame(strikeCount);
            hintCount.initCount();
        } while (status);
        System.out.println(Message.SUCCESS_GAME.getMessage());
    }

    private static boolean endGame(int strikeCount) {
        status = true;
        if (strikeCount == 3) {
            status = false;
        }
        return status;
    }

    private void applyHintCount() {
        this.strikeCount = hintCount.getStrikeCount();
        this.ballCount = hintCount.getBallCount();
    }
}
