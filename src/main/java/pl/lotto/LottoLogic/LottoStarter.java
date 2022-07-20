package pl.lotto.LottoLogic;

import pl.lotto.AwardsDisplayer;

import pl.lotto.MessageDisplayer;

import java.util.*;

public class LottoStarter {

    private final UserNumberPicker userNumberPicker;
    private final LottoNumberGenerator lottoNumberGenerator;
    private final CollectionsChecker collectionChecker;
    private final AwardsDisplayer awardsDisplayer;

    public LottoStarter(UserNumberPicker userNumberPicker, LottoNumberGenerator lottoNumberGenerator, CollectionsChecker collectionChecker, AwardsDisplayer awardsDisplayer) {
        this.userNumberPicker = userNumberPicker;
        this.lottoNumberGenerator = lottoNumberGenerator;
        this.collectionChecker = collectionChecker;
        this.awardsDisplayer = awardsDisplayer;
    }

    public void runTheGame() {
        userNumberPicker.pickNumbers();
        MessageDisplayer.displayMessage("Here are your numbers: " + UserNumberPicker.getUserNumbers());

        lottoNumberGenerator.draw(new Random());
        MessageDisplayer.displayMessage("Here are machine numbers: " + LottoNumberGenerator.getLottoRandomNumbersSet());

        MessageDisplayer.displayMessage("You hit accurate: " + collectionChecker.compareUserAndMachineNumbers(UserNumberPicker.getUserNumbers()) + " numbers");

        awardsDisplayer.printUserAward(UserNumberPicker.getUserNumbers());

        MessageDisplayer.displayMessage("Do you want play again? Yes/No");
    }
}

