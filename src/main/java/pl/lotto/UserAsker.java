package pl.lotto;

import java.util.Scanner;

public class UserAsker {

    private final Scanner scanner = new Scanner(System.in);

    public int askUserForNumber() {
        int numberFromUser = scanner.nextInt();
        scanner.nextLine();
        return numberFromUser;
    }

    public String askUserForSign() {
        return scanner.nextLine();
    }
}
