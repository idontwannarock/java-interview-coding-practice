package ampos.howard;

import org.junit.Before;
import org.junit.Test;

public class Easy2Test {

    private Easy2 easy2;

    @Before
    public void init() {
        this.easy2 = new Easy2();
    }

    @Test
    public void shouldReturnOne() {
        int stairs = 1;
        int expected = 1;
        assert easy2.easy2(stairs) == expected;
    }

    @Test
    public void shouldReturnTwo() {
        int stairs = 2;
        int expected = 2;
        assert easy2.easy2(stairs) == expected;
    }

    @Test
    public void shouldReturnThree() {
        int stairs = 3;
        int expected = 3;
        assert easy2.easy2(stairs) == expected;
    }
}
