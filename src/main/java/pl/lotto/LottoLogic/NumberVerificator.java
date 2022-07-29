package pl.lotto.LottoLogic;

import pl.lotto.UserAsker;

public class NumberVerificator {
    int verifyNumber(int numberAnswer, UserAsker userAsker) {
        while (!isInRange(numberAnswer)) {
            System.out.println("Number must be between 1-99. Please change this number");
            numberAnswer = userAsker.askUserForNumber();
        }
        return numberAnswer;
    }

    private boolean isInRange(int numberFromUser) {
        return numberFromUser >= 1 && numberFromUser <= 99;
    }

}

