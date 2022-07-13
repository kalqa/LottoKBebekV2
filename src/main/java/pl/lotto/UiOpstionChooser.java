package pl.lotto;

public class UiOpstionChooser {

    public static void chooseAnOption() {
        boolean wantToPlay = true;
        int numericResponse = UserAsker.askUser().nextInt();

        while (wantToPlay) {
            switch (numericResponse) {
                case 1 -> {
                    MiniLottoStarter.playTheGame();
                    UserAsker.askUser().nextLine();
                    if (UserAsker.askUser().nextLine().equalsIgnoreCase("No")) {
                        wantToPlay = false;
                    } else {
                        UserGameNumberPicker.getUserNumbers().clear();
                    }
                }
                case 2 -> wantToPlay = false;
            }
        }

    }
}
