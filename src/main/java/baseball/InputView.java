package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<Integer> inputNumber() {
        System.out.print(Message.INPUT_NUMBER.getMessage());
        String inputNumber = readLine();
        String[] stringArr = inputNumber.split("");
        int[] intArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        List<Integer> playerNumber = Arrays.stream(intArr).boxed().collect(Collectors.toList());
        return playerNumber;
    }
}
