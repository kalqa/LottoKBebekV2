package pl.lotto;

import pl.lotto.LottoLogic.CollectionsChecker;
import pl.lotto.LottoLogic.LottoNumberGenerator;
import pl.lotto.LottoLogic.LottoStarter;
import pl.lotto.LottoLogic.UserNumberPicker;

public class UiOptionPicker {

    public void chooseAnOption() {
        MessageDisplayer.displayMessage("""
                Choose an option below:
                1. Play
                2. Exit""");
        boolean wantToPlay = true;
        int numericResponse = new UserAsker().askUserForNumber();
        while (wantToPlay) {
            wantToPlay = isWantToPlay(numericResponse);
        }
    }

    private boolean isWantToPlay(int numericResponse) {
        boolean doesWantToPlay = true;
        switch (numericResponse) {
            case 1 -> {
                new LottoStarter(new UserNumberPicker(), new LottoNumberGenerator(), new CollectionsChecker(), new AwardsDisplayer()).runTheGame();
                String answer = new UserAsker().askUserForSign();
                if (answer.equalsIgnoreCase("No")) {
                    doesWantToPlay = false;
                    new GameStarter().chooseGame(new UserAsker());
                } else {
                    UserNumberPicker.getUserNumbers().clear();
                }
            }
            case 2 -> new GameStarter().chooseGame(new UserAsker());
        }
        return doesWantToPlay;
    }
}
