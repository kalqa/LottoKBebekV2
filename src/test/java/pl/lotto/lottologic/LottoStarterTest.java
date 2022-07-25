package pl.lotto.lottologic;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LottoStarterTest {

    @Test
    public void should_return_failed_message_when_less_than_six_numbers() {
        // given
        LottoStarter lottoForTests = new LottoConfiguration().createLottoForTests(

        );

        // when
        GameResult gameResult = lottoForTests.runTheGame();

        // then
        assertThat(gameResult.message()).isEqualTo("Should give 6 numbers");
    }

}
