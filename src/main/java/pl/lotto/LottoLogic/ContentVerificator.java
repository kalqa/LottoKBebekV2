package pl.lotto.LottoLogic;

import pl.lotto.UserAsker;

class ContentVerificator {
    private final NumberRangeVerificator numberRangeVerificator = new NumberRangeVerificator();
    int verifyContent(int numberAnswer) {
        while (UserNumberPicker.getUserNumbers().contains(numberAnswer)) {
            MessageDisplayer.displayMessage("You already wrote the number. Please change this number");
            numberAnswer = new UserAsker().askUserForNumber();
            numberAnswer = numberRangeVerificator.verifyNumberRange(numberAnswer);
        }
        return numberAnswer;
    }
}
