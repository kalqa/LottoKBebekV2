package pl.lotto.gamepicker;

import pl.lotto.GameStarter;
import pl.lotto.LottoLogic.LottoStarter;
import pl.lotto.LottoLogic.UserNumberPicker;
import pl.lotto.MessageDisplayer;
import pl.lotto.UserAsker;

public class UiOptionPicker {

    public UiResult chooseAnOption(UserAsker userAsker) {
        MessageDisplayer.displayMessage("""
                Choose an option below:
                1. Play
                2. Exit""");
        boolean wantToPlay = true;
        int numericResponse = userAsker.askUserForNumber();
        while (wantToPlay) {
            wantToPlay = isWantToPlay(numericResponse, userAsker);
        }
    }

    private static boolean isWantToPlay(int numericResponse, UserAsker userAsker) {
        boolean doesWantToPlay = true;
        switch (numericResponse) {
            case 1 -> {
                LottoStarter.runTheGame();
                if (userAsker.askUserForSign().equalsIgnoreCase("No")) {
                    doesWantToPlay = false;
                    GameStarter.chooseGame(userAsker);
                } else {
                    UserNumberPicker.getUserNumbers().clear();
                }
            }
            case 2 -> GameStarter.chooseGame(userAsker);
        }
        return doesWantToPlay;
    }
}
