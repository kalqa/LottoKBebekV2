package pl.lotto.LottoLogic;

import pl.lotto.MessageDisplayer;
import pl.lotto.UserAsker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserNumberPicker {

    private static final List<Integer> userNumbers = new ArrayList<>();

    public static void pickNumbers() {
        MessageDisplayer.displayMessage("Please write six numbers:");

        while (userNumbers.size() < 6) {
            int userNumber = UserAsker.askUser().nextInt();
            userNumber = NumberRangeVerificator.verifyNumberRange(userNumber);
            userNumber = ContentVerificator.verifyContent(userNumber);
            userNumbers.add(userNumber);
            Collections.sort(userNumbers);
        }
    }

    public static List<Integer> getUserNumbers() {
        return userNumbers;
    }
}

