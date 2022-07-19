package pl.lotto;

public class Lotto {

    private final UiOptionPicker uiOptionPicker = new UiOptionPicker();

    public Lotto() {
    }

    public void startGame() {
        uiOptionPicker.chooseAnOption();
    }
}
