package pl.lotto;

import pl.lotto.LottoLogic.MessageDisplayer;

import java.util.List;

public class GameStarter {

    private final List<Playable> games = List.of(new Lotto());

    public void chooseGame(UserAsker userAsker) {
        MessageDisplayer.displayMessage("""
                Which game do you want to play? Choose an option below:
                1. Lotto
                2. Exit""");

        switch (userAsker.askUserForNumber()) {
            case 1 -> games.get(0).startGame();
            case 2 -> System.exit(0);
        }
    }
}
