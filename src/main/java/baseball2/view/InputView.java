package baseball2.view;

import static baseball2.domain.Transducer.transToList;
import static baseball2.validator.inputNumberValidator.validateInputNumber;
import static baseball2.validator.inputRestartValidator.validateInputRestart;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.List;

public class InputView {

    public List<Integer> inputNumber() {
        System.out.print(Message.INPUT_NUMBER.getMessage());
        String input = readLine();
        try {
            validateInputNumber(input);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return inputNumber();
        }
        return transToList(input);
    }

    public String inputRestart() {
        System.out.println(Message.ASK_RESTART.getMessage());
        String input = readLine();
        try {
            validateInputRestart(input);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return inputRestart();
        }
        return input;
    }
}
