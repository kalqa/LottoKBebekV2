package pl.lotto;

import pl.lotto.gamepicker.UiOptionPicker;
import pl.lotto.gamepicker.UiResult;

public class Lotto {

    public Lotto() {
    }

    public static void startGame(UserAsker userAsker) {
        // jaka gra
        UiResult result = new UiOptionPicker().chooseAnOption(userAsker);
        // uruchomienie wybranej gry lub wyjscie z programu
    }
}
