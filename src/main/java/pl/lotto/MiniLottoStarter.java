package pl.lotto;

import java.util.*;

public class MiniLottoStarter {

    public static void runTheGame() {
        UserNumberPicker.pickNumbers();
        MessageDisplayer.displayMessage("Here are your numbers: " + UserNumberPicker.getUserNumbers());

        LottoNumberGenerator.draw(new Random());
        MessageDisplayer.displayMessage("Here are machine numbers: " + LottoNumberGenerator.getRandomNumbers());

        MessageDisplayer.displayMessage("You hit accurate: " + CollectionsChecker.checkAndCompareCollections(UserNumberPicker.getUserNumbers()) + " numbers");

        AwardsDisplayer.printUserAward(UserNumberPicker.getUserNumbers());

        MessageDisplayer.displayMessage("Do you want play again? Yes/No");
    }
}

