package pl.lotto.LottoLogic;

import pl.lotto.AwardsDisplayer;

import pl.lotto.MessageDisplayer;

import java.util.*;

public class LottoStarter {

    public static void runTheGame() {
        UserNumberPicker.pickNumbers();
        MessageDisplayer.displayMessage("Here are your numbers: " + UserNumberPicker.getUserNumbers());

        LottoNumberGenerator.draw(new Random());
        MessageDisplayer.displayMessage("Here are machine numbers: " + LottoNumberGenerator.getLottoRandomNumbersSet());

        MessageDisplayer.displayMessage("You hit accurate: " + CollectionsChecker.checkAndCompareCollections(UserNumberPicker.getUserNumbers()) + " numbers");

        AwardsDisplayer.printUserAward(UserNumberPicker.getUserNumbers());

        MessageDisplayer.displayMessage("Do you want play again? Yes/No");
    }
}

