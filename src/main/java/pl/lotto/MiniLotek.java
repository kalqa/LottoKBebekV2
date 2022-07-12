package pl.lotto;

import java.util.List;
import java.util.TreeSet;

public class MiniLotek implements Playable {

    private final TreeSet<Integer> randomNumbers = new TreeSet<>();

    public MiniLotek() {
    }



    public void printYourAward(List<Integer> userNumbers) {
        if (checkAndCompareCollections(userNumbers) == 0) {
            System.out.println("Unfortunately, your award is equal zero");
        }
        if (checkAndCompareCollections(userNumbers) == 1) {
            System.out.println("You won: 0.1 $");
        }
        if (checkAndCompareCollections(userNumbers) == 2) {
            System.out.println("You won: 2 $");
        }
        if (checkAndCompareCollections(userNumbers) == 3) {
            System.out.println("You won: 30 $");
        }
        if (checkAndCompareCollections(userNumbers) == 4) {
            System.out.println("You won: 400 $");
        }
        if (checkAndCompareCollections(userNumbers) == 5) {
            System.out.println("You won: 5000 $");
        }
        if (checkAndCompareCollections(userNumbers) == 6) {
            System.out.println("You won: 1 000 000 $");
        }

    }

    public int checkAndCompareCollections(List<Integer> userNumbers) {
        int sumOfTheSameNumbers = 0;
        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.contains(userNumbers.get(i))) {
                sumOfTheSameNumbers++;
            }
        }
        return sumOfTheSameNumbers;
    }

    public TreeSet<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
