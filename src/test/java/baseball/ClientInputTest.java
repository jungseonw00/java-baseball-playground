package baseball;

import static java.lang.Character.isDigit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientInputTest {

    @Test
    void validateInput() {
        String input = "123";
        for (char x : input.toCharArray()) {
            if (!isDigit(x)) {
            }
        }
    }
}
