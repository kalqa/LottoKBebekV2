package pl.lotto;

import pl.lotto.LottoLogic.*;

public class Main {

    public static void main(String[] args) {

        letsPlayLotto().startGame();

    }

    private static Lotto letsPlayLotto() {
        AwardsDisplayer awardsDisplayer = new AwardsDisplayer();
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        NumberVerificator numberVerificator = new NumberVerificator();
        UserNumberPicker userNumberPicker = new UserNumberPicker();
        LottoConfigurator lottoConfigurator = new LottoConfigurator(userNumberPicker, lottoNumberGenerator, awardsDisplayer, numberVerificator);
        return new Lotto(lottoConfigurator);
    }
}


