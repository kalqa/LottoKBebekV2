package pl.lotto;

import java.util.List;
import java.util.Optional;
import pl.lotto.lottologic.MessageDisplayer;

public class GameChooser {

    private final List<Playable> games;

    public GameChooser(List<Playable> games) {
        this.games = games;
    }

    public Optional<Playable> chooseGame(UserAsker userAsker) {
        MessageDisplayer.displayMessage("""
                Which game do you want to play? Choose an option below:
                """);
        int option = 1;
        for (Playable game : games) {
            MessageDisplayer.displayMessage(option + " : " + game.displayName());
            option++;
        }
        MessageDisplayer.displayMessage(option + ". Exit");

        if (userAsker.askUserForNumber() == 1) {
            return Optional.of(new Lotto());
        }
        return Optional.empty();
    }
}
