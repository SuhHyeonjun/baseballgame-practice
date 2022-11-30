package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transducer {

    public static List<Integer> transToList(String input) {
        String[] stringArr = input.split("");
        int[] intArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        return Arrays.stream(intArr).boxed().collect(Collectors.toList());
    }
}
