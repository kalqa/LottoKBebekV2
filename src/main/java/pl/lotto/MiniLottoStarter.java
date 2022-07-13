package pl.lotto;

import java.util.*;

public class MiniLottoStarter {

    public static void playTheGame() {
        UserGameNumberPicker.pickNumbers();
        MessageDisplayer.displayNumbers("Here are your numbers: " + UserGameNumberPicker.getUserNumbers());

        LottoNumberGenerator.draw(new Random());
        MessageDisplayer.displayNumbers("Here are machine numbers: " + LottoNumberGenerator.getRandomNumbers());

        MessageDisplayer.displayUserScore("You hit accurate: " + CollectionsChecker.checkAndCompareCollections(UserGameNumberPicker.getUserNumbers()) + " numbers");

        AwardsDisplayer.printUserAward(UserGameNumberPicker.getUserNumbers());

        MessageDisplayer.displayYesNoQuestion();
    }
}

