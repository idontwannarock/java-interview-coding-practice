package synergies;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMoverTest {

    @Test
    public void shouldBeTrue() {
        // given
        int[] given = {0, 0, 8, 0, 0, 0, 5, 6, 8, 2, 0, 0};

        // expected
        int[] expected = {8, 5, 6, 8, 2, 0, 0, 0, 0, 0, 0, 0};

        // assert
        int[] sorted = new ZeroMover().sort(given);
        assertEquals(expected.length, sorted.length);
        assertArrayEquals(expected, sorted);
    }
}
