package pl.lotto;

public class GameStarter {

    public static void chooseGame() {
        MessageDisplayer.displayMessage("""
                Which game do you want to play? Choose an option below:
                1. Lotto
                2. Exit""");

        switch (UserAsker.askUser().nextInt()) {
            case 1 -> Lotto.startGame();
            case 2 -> System.exit(0);
        }
    }
}
