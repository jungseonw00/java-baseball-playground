package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static baseball.ValidationUtils.validNo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void 야구_숫자_1_9_검증() {
        // 테스트 값은 경곗값을 기준으로 설정한다.
        assertThat(validNo(9)).isTrue();
        assertThat(validNo(1)).isTrue();
        assertThat(validNo(0)).isFalse();
        assertThat(validNo(10)).isFalse();
    }
}
