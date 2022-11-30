package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<Integer> inputNumber() {
        System.out.print(Message.INPUT_NUMBER.getMessage());
        String input = readLine();
        String[] stringArr = input.split("");
        int[] intArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        List<Integer> playerNumber = Arrays.stream(intArr).boxed().collect(Collectors.toList());
        return playerNumber;
    }

    public String inputRestart() {
        System.out.println(Message.ASK_RESTART.getMessage());
        String input = readLine();
        return input;
    }
}
