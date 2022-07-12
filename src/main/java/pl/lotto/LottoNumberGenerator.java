package pl.lotto;

import java.util.Random;
import java.util.TreeSet;

public class LottoNumberGenerator {
    private final TreeSet<Integer> randomNumbers = new TreeSet<>();
    public void draw(Random random) {
        while (randomNumbers.size() < 6) {
            randomNumbers.add(random.nextInt(100));
        }
    }

}
