package pl.lotto;

import java.util.*;

public class GameStarter {

    public static void playMiniLotto() {
        List<Integer> userNumbers = new ArrayList<>();
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

        System.out.println("Here are your numbers: " + userNumbers);

        LottoNumberGenerator.draw(new Random());

        System.out.println("Here are machine numbers: " + LottoNumberGenerator.getRandomNumbers());
        System.out.println("You hit accurate: " + CollectionsChecker.checkAndCompareCollections(userNumbers) + " numbers");

        AwardsDisplayer.printYourAward(userNumbers);
    }
}

