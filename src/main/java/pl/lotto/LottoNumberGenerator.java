package pl.lotto;

import java.util.Random;

public class LottoNumberGenerator {

    @Override
    public void play(Random random) {
        while (randomNumbers.size() < 6) {
            randomNumbers.add(random.nextInt(100));
        }
    }

}
