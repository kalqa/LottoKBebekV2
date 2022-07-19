package pl.lotto.LottoLogic;

import pl.lotto.AwardsDisplayer;

import pl.lotto.MessageDisplayer;

import java.util.*;

public class LottoStarter {

    private final UserNumberPicker userNumberPicker = new UserNumberPicker();
    private final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
    private final CollectionsChecker collectionsChecker = new CollectionsChecker();
    private final AwardsDisplayer awardsDisplayer = new AwardsDisplayer();

    public void runTheGame() {
        userNumberPicker.pickNumbers();
        MessageDisplayer.displayMessage("Here are your numbers: " + UserNumberPicker.getUserNumbers());

        lottoNumberGenerator.draw(new Random());
        MessageDisplayer.displayMessage("Here are machine numbers: " + lottoNumberGenerator.getLottoRandomNumbersSet());

        MessageDisplayer.displayMessage("You hit accurate: " + collectionsChecker.compareUserAndMachineNumbers(UserNumberPicker.getUserNumbers()) + " numbers");

        awardsDisplayer.printUserAward(UserNumberPicker.getUserNumbers());

        MessageDisplayer.displayMessage("Do you want play again? Yes/No");
    }
}

