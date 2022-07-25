package pl.lotto;

public class GameStarter {

    public static void chooseGame(UserAsker userAsker) {
        MessageDisplayer.displayMessage("""
                Which game do you want to play? Choose an option below:
                1. Lotto
                2. Exit""");

        switch (userAsker.askUserForNumber()) {
            case 1 -> Lotto.startGame(userAsker);
            case 2 -> System.exit(0);
        }
    }
}
