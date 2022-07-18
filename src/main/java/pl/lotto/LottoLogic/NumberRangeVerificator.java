package pl.lotto.LottoLogic;

import pl.lotto.MessageDisplayer;
import pl.lotto.UserAsker;

public class NumberRangeVerificator {

    public static int verifyNumberRange(int numberAnswer) {
        while (!isInRange(numberAnswer)) {
            MessageDisplayer.displayMessage("Your number must be between 1-99 inclusive. Please change this number");
            numberAnswer = UserAsker.askUser().nextInt();
        }
        return numberAnswer;
    }

    private static boolean isInRange(int numberFromUser) {
        return numberFromUser >= 1 && numberFromUser <= 99;
    }
}
