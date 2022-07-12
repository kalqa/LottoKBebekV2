package pl.lotto;

import java.util.List;

public class CollectionsChecker {

    private static LottoNumberGenerator lottoNumberGenerator;

    public static int checkAndCompareCollections(List<Integer> userNumbers) {
        int sumOfTheSameNumbers = 0;
        for (int i = 0; i < lottoNumberGenerator.getRandomNumbers().size(); i++) {
            if (lottoNumberGenerator.getRandomNumbers().contains(userNumbers.get(i))) {
                sumOfTheSameNumbers++;
            }
        }
        return sumOfTheSameNumbers;
    }
}
