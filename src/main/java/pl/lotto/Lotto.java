package pl.lotto;

import pl.lotto.LottoLogic.LottoConfigurator;

public class Lotto implements Playable {

    private final LottoConfigurator lottoConfigurator;

    public Lotto(LottoConfigurator lottoConfigurator) {
        this.lottoConfigurator = lottoConfigurator;
    }


    @Override
    public void startGame() {
        lottoConfigurator.runTheGame(new UserAsker());
    }
}

