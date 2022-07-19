package pl.lotto.LottoLogic;

import pl.lotto.MessageDisplayer;
import pl.lotto.UserAsker;

public class NumberRangeVerificator {

    public int verifyNumberRange(int numberAnswer) {
        while (!isInRange(numberAnswer)) {
            MessageDisplayer.displayMessage("Your number must be between 1-99 inclusive. Please change this number");
            numberAnswer = new UserAsker().askUserForNumber();
        }
        return numberAnswer;
    }

    private boolean isInRange(int numberFromUser) {
        return numberFromUser >= 1 && numberFromUser <= 99;
    }
}
