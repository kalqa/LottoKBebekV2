package pl.lotto;

public class UiOptionPicker {

    public static void chooseAnOption() {
        MessageDisplayer.displayMessage("""
                Choose an option below:
                1. Play
                2. Exit""");
        boolean wantToPlay = true;
        int numericResponse = UserAsker.askUser().nextInt();
        while (wantToPlay) {
            wantToPlay = WantToPlayChecker.isWantToPlay(true, numericResponse);
        }
    }
}
