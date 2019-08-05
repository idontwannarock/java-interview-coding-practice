package ampos.lance.easy;

public class RotateTwoDimensionArray {

    public int[][] rotate(int[][] inputArray) {
        // Given two dimension array of image pixels in integers.
        // Implement function to rotate image 90 degrees
        int[][] resultArray = new int[3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) resultArray[2][i] = inputArray[i][j];
                else if (j == 2) resultArray[0][i] = inputArray[i][j];
                else resultArray[j][i] = inputArray[i][j];
            }
        }
        return resultArray;
    }
}
