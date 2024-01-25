package baseball;

import static baseball.BallStatus.BALL;
import static baseball.BallStatus.NOTHING;
import static baseball.BallStatus.STRIKE;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BallsTest {

    @Test
    void play_nothing() {
        Balls answers = new Balls(asList(1, 2, 3));
        PlayResult result = answers.play(asList(4, 5, 6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void play_1strike_1ball() {
        Balls answers = new Balls(asList(1, 2, 3));
        PlayResult result = answers.play(asList(1, 4, 2));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void strike() {
        Balls answers = new Balls(asList(1, 2, 3));
        BallStatus status = answers.play(new Ball(1, 1));
        assertThat(status).isEqualTo(STRIKE);
    }

    @Test
    void ball() {
        Balls answers = new Balls(asList(1, 2, 3));
        BallStatus status = answers.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BALL);
    }
    
    @Test
    void nothing() {
        Balls answers = new Balls(asList(1, 2, 3));
        BallStatus status = answers.play(new Ball(5, 4));
        assertThat(status).isEqualTo(NOTHING);
    }
}