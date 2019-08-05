package ampos.lance.moderate;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class GetDiagonalTableTest {

    private int[][] firstDiagonalTable = {{2, 1}, {4, 3}};
    private int[][] secondDiagonalTable = {{4, 2, 1}, {7, 5, 3}, {9, 8, 6}};

    private GetDiagonalTable getter;

    @Before
    public void init() {
        this.getter = new GetDiagonalTable();
    }

    @Test
    public void shouldReturnFirstDiagonalTable() {
        assert Arrays.deepEquals(firstDiagonalTable, getter.getDiagonalTable(2));
    }

    @Test
    public void shouldReturnSecondDiagonalTable() {
        assert Arrays.deepEquals(secondDiagonalTable, getter.getDiagonalTable(3));
    }
}
