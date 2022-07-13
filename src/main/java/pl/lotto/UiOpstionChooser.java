package pl.lotto;

import java.util.Scanner;

public class UiOpstionChooser {

    public static void chooseAnOption() {
        boolean wantToPlay = true;
        int numericResponse = UserAsker.askUser().nextInt();

        while (wantToPlay) {
            switch (numericResponse) {
                case 1 -> {
                    GameStarter.playMiniLotto();
                    MessageDisplayer.displayYesNoQuestion();
                    UserAsker.askUser().nextLine();
                    if (UserAsker.askUser().nextLine().equalsIgnoreCase("No")) {
                        wantToPlay = false;
                    }
                }
                case 2 -> wantToPlay = false;

            }
        }

    }
}
