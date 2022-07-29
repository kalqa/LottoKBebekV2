package pl.lotto.LottoLogic;

import java.util.Random;
import java.util.TreeSet;

public class LottoNumberGenerator {

    private static final TreeSet<Integer> lottoRandomNumbersSet = new TreeSet<>();

    void draw(Random random) {
        while (lottoRandomNumbersSet.size() < 6) {
            lottoRandomNumbersSet.add(random.nextInt(1, 100));
        }
    }

    public TreeSet<Integer> getLottoRandomNumbersSet() {
        return lottoRandomNumbersSet;
    }
}
