package pl.lotto.LottoLogic;

import java.util.Random;
import java.util.TreeSet;

public class LottoNumberGenerator {

    private final TreeSet<Integer> lottoRandomNumbersSet = new TreeSet<>();

    public void draw(Random random) {
        while (lottoRandomNumbersSet.size() < 6) {
            lottoRandomNumbersSet.add(random.nextInt(100));
        }
    }

    public TreeSet<Integer> getLottoRandomNumbersSet() {
        return lottoRandomNumbersSet;
    }
}
