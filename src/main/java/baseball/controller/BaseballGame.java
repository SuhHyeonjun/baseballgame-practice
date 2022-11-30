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
    private static final int THREE_STRIKE = 3;
    private static final String RESTART = "1";
    private static final String QUIT = "2";
    private static boolean status = true;
    private static int gameCount = 0;
    private int strikeCount;
    private int ballCount;

    public void start() {
        System.out.println(Message.START_GAME.getMessage());
        List<Integer> computerNumbers = computer.createRandomNumbers();
        runGame(computerNumbers);
        System.out.println(Message.SUCCESS_GAME.getMessage());
        gameCount++;
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
        if (strikeCount == THREE_STRIKE) {
            status = false;
        }
        return status;
    }

    private void restartGame(String select) {
        if (select.equals(RESTART)) {
            start();
        }
        if (select.equals(QUIT)) {
            System.out.println(Message.ENDGAME.getMessage());
            outputView.printTotalCount(gameCount);
        }
    }

    private void applyHintCount() {
        this.strikeCount = hintCount.getStrikeCount();
        this.ballCount = hintCount.getBallCount();
    }
}
