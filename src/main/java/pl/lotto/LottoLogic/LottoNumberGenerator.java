package pl.lotto.LottoLogic;

import java.util.Random;
import java.util.TreeSet;

class LottoNumberGenerator {

    private static final TreeSet<Integer> lottoRandomNumbersSet = new TreeSet<>();

    void draw(Random random) {
        while (lottoRandomNumbersSet.size() < 6) {
            lottoRandomNumbersSet.add(random.nextInt(100));
        }
    }

    static TreeSet<Integer> getLottoRandomNumbersSet() {
        return lottoRandomNumbersSet;
    }
}
