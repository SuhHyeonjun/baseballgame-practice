package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.HintCount;
import baseball.view.InputView;
import baseball.view.Message;
import baseball.view.OutputView;
import java.util.List;

public class BaseballGame {
    private static final Computer computer = new Computer();
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();
    private static final HintCount hintCount = new HintCount();
    private static boolean status = true;
    private int strikeCount;
    private int ballCount;

    public void start() {
        System.out.println(Message.START_GAME.getMessage());
        List<Integer> computerNumbers = computer.createRandomNumbers();
        runGame(computerNumbers);
        System.out.println(Message.SUCCESS_GAME.getMessage());
        String select = inputView.inputRestart();
        restartGame(select);
    }

    private void runGame(List<Integer> computerNumbers) {
        do {
            System.out.println(computerNumbers);
            List<Integer> playerNumber = inputView.inputNumber();
            hintCount.getHintCount(computerNumbers, playerNumber);
            applyHintCount();
            outputView.printResult(strikeCount, ballCount);
            endGame(strikeCount);
            hintCount.initCount();
        } while (status);
    }

    private static boolean endGame(int strikeCount) {
        status = true;
        if (strikeCount == 3) {
            status = false;
        }
        return status;
    }

    private void restartGame(String select) {
        if (select.equals("1")) {
            start();
        }
        if (select.equals("2")) {
            System.out.println(Message.ENDGAME.getMessage());
        }
    }

    private void applyHintCount() {
        this.strikeCount = hintCount.getStrikeCount();
        this.ballCount = hintCount.getBallCount();
    }
}
