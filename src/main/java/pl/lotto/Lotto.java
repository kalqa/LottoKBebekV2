package pl.lotto;

public class Lotto implements Playable {

    private final UiOptionPicker uiOptionPicker = new UiOptionPicker();

    public Lotto() {
    }

    @Override
    public void startGame() {
        uiOptionPicker.chooseAnOption();
    }
}

