package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    public void testAssertJCatchers() {
        // given
        String text1 = "abc";
        String[] textArr = {"abc","def","ghj"};
        // when

        // then
        assertThat(textArr)
                .hasSize(3)
                .contains(text1)
                .contains("def")
                .doesNotContain("obs");
    }

    @Test
    public void shouldAddTwoNumbers() {
        // given
        int num1 = 5;
        int num2 = -20;

        // when
        int result = num1 + num2;

        // then
        assertThat(result)
                .isEqualTo(-15)
                .isNotEqualTo(15)
                .isLessThan(100)
                .isBetween(-99,99);
    }
}
