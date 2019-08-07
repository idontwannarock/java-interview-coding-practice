package ampos.howard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Onsite1Test {

    private Onsite1 onsite1;

    @Before
    public void init() {
        this.onsite1 = new Onsite1();
    }

    @Test
    public void shouldReturnFalseForNegativeInput() {
        int input = -1;
        boolean expected = false;
        assertEquals(onsite1.isPrime(input), expected);
    }

    @Test
    public void shouldReturnFalseForZero() {
        int input = 0;
        boolean expected = false;
        assertEquals(onsite1.isPrime(input), expected);
    }

    @Test
    public void shouldReturnFalseForOne() {
        int input = 1;
        boolean expected = false;
        assertEquals(onsite1.isPrime(input), expected);
    }

    @Test
    public void shouldReturnTrueForTwo() {
        int input = 2;
        boolean expected = true;
        assertEquals(onsite1.isPrime(input), expected);
    }

    @Test
    public void shouldReturnFalseForFour() {
        int input = 4;
        boolean expected = false;
        assertEquals(onsite1.isPrime(input), expected);
    }

    @Test
    public void shouldReturnTrueForSeventeen() {
        int input = 17;
        boolean expected = true;
        assertEquals(onsite1.isPrime(input), expected);
    }
}
