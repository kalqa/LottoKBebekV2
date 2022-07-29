package pl.lotto;

import java.util.Scanner;

public class UserAsker {

    private final Scanner scanner = new Scanner(System.in);

    public int askUserForNumber() {
        return scanner.nextInt();
    }

}
