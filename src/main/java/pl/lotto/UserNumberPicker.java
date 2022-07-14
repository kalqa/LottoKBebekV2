package pl.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserNumberPicker {

    private static final List<Integer> userNumbers = new ArrayList<>();

    public static void pickNumbers() {
        MessageDisplayer.displayMessage("Please write six numbers:");

        while (userNumbers.size() < 6) {
            int numberAnswer = UserAsker.askUser().nextInt();
            numberAnswer = NumberRangeVerificator.verifyNumberRange(numberAnswer);
            numberAnswer = ContentVerificator.verifyContent(numberAnswer);
            userNumbers.add(numberAnswer);
            Collections.sort(userNumbers);
        }
    }

    public static List<Integer> getUserNumbers() {
        return userNumbers;
    }
}

