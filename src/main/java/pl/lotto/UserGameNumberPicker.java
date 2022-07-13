package pl.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserGameNumberPicker {

    private static final List<Integer> userNumbers = new ArrayList<>();

    public static void pickNumbers() {
        System.out.println("Please write six numbers:");

        while (userNumbers.size() < 6) {
            int numberAnswer = UserAsker.askUser().nextInt();
            if (!RangeChecker.isInRange(numberAnswer)) {
                System.out.println("Your number must be between 1-99 inclusive");
            }
            if (userNumbers.contains(numberAnswer)) {
                System.out.println("You already wrote the number.");
            }
            userNumbers.add(numberAnswer);
            Collections.sort(userNumbers);
        }
    }

    public static List<Integer> getUserNumbers() {
        return userNumbers;
    }
}
