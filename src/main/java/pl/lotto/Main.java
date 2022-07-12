package pl.lotto;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("Do you wany to play a MiniLotek? Choose an option below:");
        System.out.println("1. Play");
        System.out.println("2. Exit");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        boolean wantToPlay = true;

        while (wantToPlay) {
            switch (option) {
                case 1 -> {
                    play(scanner);
                    System.out.println("Do you want play again? Yes/No");
//                    Scanner scanner = new Scanner(System.in);
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("No")) {
                        wantToPlay = false;
                    }
                }
                case 2 -> wantToPlay = false;

            }
        }

    }

    private static void play(Scanner scanner) {
//        Scanner scanner = new Scanner(System.in);
        Set<Integer> userNumbers = new TreeSet<>();
        System.out.println("Please write six numbers:");

        while (userNumbers.size() < 6) {
            int i = scanner.nextInt();
            if (!isInRange(i)) {
                System.out.println("Your number must be between 1-99 inclusive");
//                throw new BadValueException("Your number must be between 1-99 inclusive");
            }
//            if (userNumbers.contains(i)) {
//                throw new RepeatsValueException("You already wrote the number.");
//            }
            userNumbers.add(i);
//            Collections.sort(userNumbers);
        }

        System.out.println("Here are your numbers: " + userNumbers);

        MiniLotek miniLotek = new MiniLotek();
        miniLotek.play(new Random());

        System.out.println("Here are machine numbers: " + miniLotek.getRandomNumbers());
        System.out.println("You hit accurate: " + miniLotek.checkAndCompareCollections(userNumbers) + " numbers");

        miniLotek.printYourAward(userNumbers);
    }

    private static boolean isInRange(int numberFromUser) {
        return numberFromUser >= 1 && numberFromUser <= 99;
    }
}


