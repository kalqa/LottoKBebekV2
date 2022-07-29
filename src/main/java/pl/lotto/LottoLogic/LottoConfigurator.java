package pl.lotto.LottoLogic;

import pl.lotto.UserAsker;

import java.util.*;

public class LottoConfigurator {

    private final UserNumberPicker userNumberPicker;
    private final LottoNumberGenerator lottoNumberGenerator;
    private final AwardsDisplayer awardsDisplayer;
    private final NumberVerificator numberVerificator;

    public LottoConfigurator(UserNumberPicker userNumberPicker, LottoNumberGenerator lottoNumberGenerator, AwardsDisplayer awardsDisplayer, NumberVerificator numberVerificator) {
        this.userNumberPicker = userNumberPicker;
        this.lottoNumberGenerator = lottoNumberGenerator;
        this.awardsDisplayer = awardsDisplayer;
        this.numberVerificator = numberVerificator;
    }

    public void runTheGame(UserAsker userAsker) {
        userNumberPicker.pickNumbers(userAsker, numberVerificator);
        MessageDisplayer.displayMessage("Here are your numbers: " + userNumberPicker.getUserNumbers());

        lottoNumberGenerator.draw(new Random());
        MessageDisplayer.displayMessage("Here are machine numbers: " + lottoNumberGenerator.getLottoRandomNumbersSet());

        awardsDisplayer.printUserAward(userNumberPicker, lottoNumberGenerator);

    }
}

