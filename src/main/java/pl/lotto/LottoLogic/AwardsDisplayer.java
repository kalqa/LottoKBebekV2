package pl.lotto.LottoLogic;

import java.util.List;

class AwardsDisplayer {

    private final CollectionsChecker collectionsChecker = new CollectionsChecker();
    void printUserAward(List<Integer> userNumbers) {
        if (collectionsChecker.compareUserAndMachineNumbers(userNumbers) == 0) {
            System.out.println("Unfortunately, your award is equal zero");
        }
        if (collectionsChecker.compareUserAndMachineNumbers(userNumbers) == 1) {
            System.out.println("You won: 0.1 $");
        }
        if (collectionsChecker.compareUserAndMachineNumbers(userNumbers) == 2) {
            System.out.println("You won: 2 $");
        }
        if (collectionsChecker.compareUserAndMachineNumbers(userNumbers) == 3) {
            System.out.println("You won: 30 $");
        }
        if (collectionsChecker.compareUserAndMachineNumbers(userNumbers) == 4) {
            System.out.println("You won: 400 $");
        }
        if (collectionsChecker.compareUserAndMachineNumbers(userNumbers) == 5) {
            System.out.println("You won: 5000 $");
        }
        if (collectionsChecker.compareUserAndMachineNumbers(userNumbers) == 6) {
            System.out.println("You won: 1 000 000 $");
        }

    }
}
