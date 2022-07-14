package pl.lotto;

public class GameStarter {

    public static void chooseGame() {
        MessageDisplayer.displayMessage("""
                Which game do you want to play? Choose an option below:
                1. Minilotto
                2. Exit""");

        switch (UserAsker.askUser().nextInt()) {
            case 1 -> MiniLotek.startGame();
            case 2 -> System.exit(0);
        }
    }
}
