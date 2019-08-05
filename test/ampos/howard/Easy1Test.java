package ampos.howard;

import org.junit.Before;
import org.junit.Test;

public class Easy1Test {

    private Easy1 easy1;

    @Before
    public void init() {
        this.easy1 = new Easy1();
    }

    @Test
    public void shouldReturnThree() {
        int[] input = {1, 1, 2, 2, 3};
        int expected = 3;
        assert easy1.easy1(input) == expected;
        // 000
        // 001
        //=001
        // 001
        //=000
        // 010
        //=010
        // 010
        //=000
        // 011
        //=011 -> 3
    }

    @Test
    public void shouldReturnFour() {
        int[] input = {-1, 2, 4, 2, -1};
        int expected = 4;
        assert easy1.easy1(input) == expected;
        // 0000
        // 1001
        //=1001
        // 0010
        //=1011
        // 0100
        //=1111
        // 0010
        //=1101
        // 1001
        //=0100 -> 4
    }

    @Test
    public void shouldReturnFive() {
        int[] input = {-1, 4, 2, 5, 4, 2, -1};
        int expected = 5;
        assert easy1.easy1(input) == expected;
        // 0000
        // 1001
        //=1001
        // 0100
        //=1101
        // 0010
        //=1111
        // 0101
        //=1010
        // 0100
        //=1110
        // 0010
        //=1100
        // 1001
        //=0101 -> 5
    }
}
