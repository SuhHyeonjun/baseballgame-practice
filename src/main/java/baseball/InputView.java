package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public static String inputNumber() {
        System.out.print(Message.INPUT_NUMBER.getMessage());
        String playerNumber = readLine();
        return playerNumber;
    }
}
