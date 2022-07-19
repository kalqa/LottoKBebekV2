package pl.lotto.LottoLogic;

import pl.lotto.MessageDisplayer;
import pl.lotto.UserAsker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserNumberPicker {
    private final NumberRangeVerificator numberRangeVerificator = new NumberRangeVerificator();
    private final ContentVerificator contentVerificator = new ContentVerificator();
    private static final List<Integer> userNumbers = new ArrayList<>();

    public void pickNumbers() {
        MessageDisplayer.displayMessage("Please write six numbers:");

        while (userNumbers.size() < 6) {
            int userNumber = new UserAsker().askUserForNumber();
            userNumber = numberRangeVerificator.verifyNumberRange(userNumber);
            userNumber = contentVerificator.verifyContent(userNumber);
            userNumbers.add(userNumber);
            Collections.sort(userNumbers);
        }
    }

    public static List<Integer> getUserNumbers() {
        return userNumbers;
    }
}

