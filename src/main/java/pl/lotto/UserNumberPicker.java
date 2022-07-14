package pl.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserNumberPicker {

    private static final List<Integer> userNumbers = new ArrayList<>();

    public static void pickNumbers() {
        MessageDisplayer.displayMessage("Please write six numbers:");

        while (userNumbers.size() < 6) {
            int numberAnswer = UserAsker.askUser().nextInt();

            while (!RangeChecker.isInRange(numberAnswer)) {
                MessageDisplayer.displayMessage("Your number must be between 1-99 inclusive. Please change this number");
                numberAnswer = UserAsker.askUser().nextInt();
            }
            while (userNumbers.contains(numberAnswer)) {
                MessageDisplayer.displayMessage("You already wrote the number. Please change this number");
                numberAnswer = UserAsker.askUser().nextInt();
            }
            userNumbers.add(numberAnswer);
            Collections.sort(userNumbers);
        }
    }

    public static List<Integer> getUserNumbers() {
        return userNumbers;
    }
}
