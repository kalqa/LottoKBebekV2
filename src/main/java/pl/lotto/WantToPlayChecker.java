package pl.lotto;

public class WantToPlayChecker {

    public static boolean isWantToPlay(boolean wantToPlay, int numericResponse) {
        switch (numericResponse) {
            case 1 -> {
                LottoStarter.runTheGame();
                UserAsker.askUser().nextLine();
                if (UserAsker.askUser().nextLine().equalsIgnoreCase("No")) {
                    wantToPlay = false;
                    GameStarter.chooseGame();
                } else {
                    UserNumberPicker.getUserNumbers().clear();
                }
            }
            case 2 -> GameStarter.chooseGame();
        }
        return wantToPlay;
    }
}
