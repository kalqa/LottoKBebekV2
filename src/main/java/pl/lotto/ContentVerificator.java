package pl.lotto;

public class ContentVerificator {

    public static int verifyContent(int numberAnswer) {
        while (UserNumberPicker.getUserNumbers().contains(numberAnswer)) {
            MessageDisplayer.displayMessage("You already wrote the number. Please change this number");
            numberAnswer = UserAsker.askUser().nextInt();
            numberAnswer = NumberRangeVerificator.verifyNumberRange(numberAnswer);
        }
        return numberAnswer;
    }
}
