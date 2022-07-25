package pl.lotto;

import pl.lotto.lottologic.UiOptionPicker;

public class Lotto implements Playable {

    private final UiOptionPicker uiOptionPicker = new UiOptionPicker();

    public Lotto() {
    }

    @Override
    public void startGame() {
        uiOptionPicker.chooseAnOption();
    }

    @Override
    public String displayName() {
        return "Lotto";
    }
}

