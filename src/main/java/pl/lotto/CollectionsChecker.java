package pl.lotto;

import java.util.List;

public class CollectionsChecker {
    public static int checkAndCompareCollections(List<Integer> userNumbers) {
        int sumOfTheSameNumbers = 0;
        for (int i = 0; i < LottoNumberGenerator.getLottoRandomNumbersSet().size(); i++) {
            if (LottoNumberGenerator.getLottoRandomNumbersSet().contains(userNumbers.get(i))) {
                sumOfTheSameNumbers++;
            }
        }
        return sumOfTheSameNumbers;
    }
}
