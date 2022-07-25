package pl.lotto;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        UserAsker userAsker = new UserAsker();
        List<Playable> games = List.of(
                new Lotto()
        );

        Optional<Playable> playable = new GameChooser(games).chooseGame(userAsker);
        playable.ifPresent(Playable::startGame);
    }
}
