package pl.lotto.LottoLogic;

import java.util.List;
import java.util.Set;

public class AwardsDisplayer {

    void printUserAward(UserNumberPicker userNumberPicker, LottoNumberGenerator lottoNumberGenerator) {
        int option = countAmountOfNumbersHit(userNumberPicker.getUserNumbers(),
                lottoNumberGenerator.getLottoRandomNumbersSet());
        switch (option) {
            case 1 -> System.out.println("You hit " + option + " digit. Your award: " + SizeOfAward.AWARD_FOR_THE_ONE + "$");
            case 2 -> System.out.println("You hit " + option + " digit. Your award: " + SizeOfAward.AWARD_FOR_THE_TWO + "$");
            case 3 -> System.out.println("You hit " + option + " digit. Your award: " + SizeOfAward.AWARD_FOR_THE_THREE + "$");
            case 4 -> System.out.println("You hit " + option + " digit. Your award: " + SizeOfAward.AWARD_FOR_THE_FOUR + "$");
            case 5 -> System.out.println("You hit " + option + " digit. Your award: " + SizeOfAward.AWARD_FOR_THE_FIVE + "$");
            case 6 -> System.out.println("You hit " + option + " digit. Your award: " + SizeOfAward.AWARD_FOR_THE_SIX + "$");
            default -> {
                System.out.println("Unfortunately, your award is equal zero");
                System.exit(0);
            }
        }
    }

    private int countAmountOfNumbersHit(Set<Integer> userNumbersSet, Set<Integer> lottoRandomNumbersSet) {
        List<Integer> integers1 = userNumbersSet.stream().toList();
        List<Integer> integers = lottoRandomNumbersSet.stream().toList();
        int sumOfTheSameNumbers = 0;
        for (int i = 0; i < integers1.size(); i++) {
            if (integers1.contains(integers.get(i))) {
                sumOfTheSameNumbers++;
            }
        }
        return sumOfTheSameNumbers;
    }
}