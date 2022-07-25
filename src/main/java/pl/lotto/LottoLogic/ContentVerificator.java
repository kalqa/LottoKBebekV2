package pl.lotto.LottoLogic;

import pl.lotto.MessageDisplayer;
import pl.lotto.UserAsker;

public class ContentVerificator {

    public static int verifyContent(int numberAnswer) {
        while (UserNumberPicker.getUserNumbers().contains(numberAnswer)) {
            MessageDisplayer.displayMessage("You already wrote the number. Please change this number");
            numberAnswer = UserAsker.askUserForNumber();
            numberAnswer = NumberRangeVerificator.verifyNumberRange(numberAnswer);
        }
        return numberAnswer;
    }
}
