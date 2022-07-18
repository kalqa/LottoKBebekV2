package pl.lotto;

import pl.lotto.LottoLogic.LottoStarter;
import pl.lotto.LottoLogic.UserNumberPicker;

public class UiOptionPicker {

    public static void chooseAnOption() {
        MessageDisplayer.displayMessage("""
                Choose an option below:
                1. Play
                2. Exit""");
        boolean wantToPlay = true;
        int numericResponse = UserAsker.askUser().nextInt();
        while (wantToPlay) {
            wantToPlay = isWantToPlay(numericResponse);
        }
    }

    private static boolean isWantToPlay(int numericResponse) {
        boolean doesWantToPlay = true;
        switch (numericResponse) {
            case 1 -> {
                LottoStarter.runTheGame();
                UserAsker.askUser().nextLine();
                if (UserAsker.askUser().nextLine().equalsIgnoreCase("No")) {
                    doesWantToPlay = false;
                    GameStarter.chooseGame();
                } else {
                    UserNumberPicker.getUserNumbers().clear();
                }
            }
            case 2 -> GameStarter.chooseGame();
        }
        return doesWantToPlay;
    }
}
