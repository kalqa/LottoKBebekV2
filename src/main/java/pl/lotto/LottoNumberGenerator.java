package pl.lotto;

import java.util.Random;
import java.util.TreeSet;

public class LottoNumberGenerator {

    private static final TreeSet<Integer> randomNumbers = new TreeSet<>();
    public static void draw(Random random) {
        while (randomNumbers.size() < 6) {
            randomNumbers.add(random.nextInt(100));
        }
    }
    public static TreeSet<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
