package pl.lotto.LottoLogic;

import java.util.*;

public class LottoStarter {

    private final UserNumberPicker userNumberPicker;
    private final LottoNumberGenerator lottoNumberGenerator;
    private final CollectionsChecker collectionChecker;
    private final AwardsDisplayer awardsDisplayer;

    public LottoStarter() {
        userNumberPicker = new UserNumberPicker();
        lottoNumberGenerator = new LottoNumberGenerator();
        collectionChecker = new CollectionsChecker();
        awardsDisplayer = new AwardsDisplayer();

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

