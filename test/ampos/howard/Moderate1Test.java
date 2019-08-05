package ampos.howard;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Moderate1Test {

    private Moderate1 moderate1;

    @Before
    public void init() {
        this.moderate1 = new Moderate1();
    }

    @Test
    public void shouldReturnExpectedArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assert Arrays.equals(moderate1.moderate1(input), expected);
    }
}
