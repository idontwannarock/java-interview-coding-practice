package ampos.lance.easy;

import org.junit.Before;
import org.junit.Test;

public class ParenthesisCountTest {

    private ParenthesisCount count;

    @Before
    public void init() {
        this.count = new ParenthesisCount();
    }

    @Test
    public void inputShouldReturnThree() {
        assert count.parenthesisCount("(a)(b)()c") == 3;
    }

    @Test
    public void inputShouldReturnThreeAgain() {
        assert count.parenthesisCount("(a(b(c)d))") == 3;
    }

    @Test
    public void inputShouldReturnZero() {
        assert count.parenthesisCount("oauaoeuu") == 0;
    }

    @Test
    public void inputShouldReturnMinusOne() {
        assert count.parenthesisCount("o(uaoeuu") == -1;
    }
}
