package pl.lotto;

import java.util.List;

public class AwardsDisplayer {

        public static void printYourAward(List<Integer> userNumbers) {
        if (CollectionsChecker.checkAndCompareCollections(userNumbers) == 0) {
            System.out.println("Unfortunately, your award is equal zero");
        }
        if (CollectionsChecker.checkAndCompareCollections(userNumbers) == 1) {
            System.out.println("You won: 0.1 $");
        }
        if (CollectionsChecker.checkAndCompareCollections(userNumbers) == 2) {
            System.out.println("You won: 2 $");
        }
        if (CollectionsChecker.checkAndCompareCollections(userNumbers) == 3) {
            System.out.println("You won: 30 $");
        }
        if (CollectionsChecker.checkAndCompareCollections(userNumbers) == 4) {
            System.out.println("You won: 400 $");
        }
        if (CollectionsChecker.checkAndCompareCollections(userNumbers) == 5) {
            System.out.println("You won: 5000 $");
        }
        if (CollectionsChecker.checkAndCompareCollections(userNumbers) == 6) {
            System.out.println("You won: 1 000 000 $");
        }

    }
}
