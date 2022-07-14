package pl.lotto;

public class NumberRangeVerificator {

    public static int verifyNumberRange(int numberAnswer) {
        while (!RangeChecker.isInRange(numberAnswer)) {
            MessageDisplayer.displayMessage("Your number must be between 1-99 inclusive. Please change this number");
            numberAnswer = UserAsker.askUser().nextInt();
        }
        return numberAnswer;
    }
}
