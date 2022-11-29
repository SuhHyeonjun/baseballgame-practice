package baseball;

import static baseball.HintCount.getBallCount;
import static baseball.HintCount.getHintCount;
import static baseball.HintCount.getStrikeCount;

import java.util.List;

public class BaseballGame {
    private static int strikeCount;
    private static int ballCount;
    private final Computer computer = new Computer();
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void start() {
        System.out.println(Message.START_GAME.getMessage());
        List<Integer> computerNumbers = computer.createRandomNumbers();
        System.out.println(computerNumbers);
        List<Integer> playerNumber = inputView.inputNumber();
        getHintCount(computerNumbers, playerNumber);
        applyHintCount();
        outputView.printResult(strikeCount, ballCount);
    }

    public static void applyHintCount() {
        strikeCount = getStrikeCount();
        ballCount = getBallCount();
    }
}
