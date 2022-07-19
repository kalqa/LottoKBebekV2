package pl.lotto.LottoLogic;

import java.util.List;

public class CollectionsChecker {

    private final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
    public int compareUserAndMachineNumbers(List<Integer> userNumbers) {
        int sumOfTheSameNumbers = 0;
        for (int i = 0; i < lottoNumberGenerator.getLottoRandomNumbersSet().size(); i++) {
            if (lottoNumberGenerator.getLottoRandomNumbersSet().contains(userNumbers.get(i))) {
                sumOfTheSameNumbers++;
            }
        }
        return sumOfTheSameNumbers;
    }
}
