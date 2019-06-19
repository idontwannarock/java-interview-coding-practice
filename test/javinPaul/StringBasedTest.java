package javinPaul;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringBasedTest {

    @Test
    public void test01IsStringReversed() {
        StringBasedQuestions solution = new StringBasedQuestions();
        String input = "123456";
        String expected = "654321";
        assertThat(solution.reverseString1(input), is(expected));
        assertThat(solution.reverseString2(input), is(expected));
    }
}
