package pl.lotto;

public class UiOpstionChooser {

    public static void chooseAnOption() {
        MessageDisplayer.displayMessage("""
                Choose an option below:
                1. Play
                2. Exit""");
        boolean wantToPlay = true;
        int numericResponse = UserAsker.askUser().nextInt();
        while (wantToPlay) {
            switch (numericResponse) {
                case 1 -> {
                    MiniLottoStarter.runTheGame();
                    UserAsker.askUser().nextLine();
                    if (UserAsker.askUser().nextLine().equalsIgnoreCase("No")) {
                        wantToPlay = false;
                        GameStarter.chooseGame();
                    } else {
                        UserNumberPicker.getUserNumbers().clear();
                    }
                }
                case 2 -> System.exit(0);
            }
        }
    }
}
