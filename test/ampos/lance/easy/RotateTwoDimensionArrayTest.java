package ampos.lance.easy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class RotateTwoDimensionArrayTest {

    private int[][] twoDimensionArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    private int[][] rotatedArray = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};

    @Before
    public void init() {
        System.out.println("Original array: ");
        for (int[] array : twoDimensionArray) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
    }

    @Test
    public void rotateTest() {
        RotateTwoDimensionArray rotater = new RotateTwoDimensionArray();
        rotater.rotate(twoDimensionArray);
        int[][] resultArray = rotater.rotate(twoDimensionArray);

        System.out.println("Rotated array: ");
        for (int[] array : resultArray) {
            System.out.println(Arrays.toString(array));
        }
        assert Arrays.deepEquals(resultArray, rotatedArray);
    }
}
