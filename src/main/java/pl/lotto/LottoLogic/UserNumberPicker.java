package pl.lotto.LottoLogic;

import pl.lotto.UserAsker;

import java.util.TreeSet;

public class UserNumberPicker {
    private final TreeSet<Integer> userNumbers = new TreeSet<>();

    void pickNumbers(UserAsker userAsker, NumberVerificator numberVerificator) {
        MessageDisplayer.displayMessage("Please write six numbers:");

        while (userNumbers.size() < 6) {
            int userNumber = userAsker.askUserForNumber();
            userNumber = numberVerificator.verifyNumber(userNumber, userAsker);
            userNumbers.add(userNumber);
        }
    }


    public TreeSet<Integer> getUserNumbers() {
        return userNumbers;
    }
}

