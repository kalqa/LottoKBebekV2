package pl.lotto;

import java.util.Scanner;

public class UiOpstionChooser {

    public static void chooseAnOption() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        boolean wantToPlay = true;

        while (wantToPlay) {
            switch (option) {
                case 1 -> {
                    GameStarter.play(scanner);
                    MessageDisplayer.displayYesNoQuestion();
                    scanner.nextLine();
                    if (scanner.nextLine().equalsIgnoreCase("No")) {
                        wantToPlay = false;
                    }
                }
                case 2 -> wantToPlay = false;

            }
        }

    }
}
