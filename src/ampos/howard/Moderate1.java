package ampos.howard;

import java.util.Arrays;

public class Moderate1 {

    // Implement a method moderate1 that given an array of integers nums,
    // returns an array of integers output where output[i] = product of all elements in nums except nums[i].
    // You must solve it with O(n) time-complexity and without using division operation.
    //
    // Example
    // Input: [1, 2, 3, 4]
    // Output: [24, 12, 8, 6]
    //
    // From the example, output[1] = product of all elements in nums except nums[1] which is 1 * 3 * 4 = 12
    //
    // (Optional) bonus point: solve with O(1) space-complexity (except the output array)

    public int[] moderate1(int[] nums) {
        // Implement moderate#1 question here
        // nums = [1, 2, 3, 4]
        int[] result = new int[nums.length];
        // result = [,,,]

        result[nums.length - 1] = 1;
        // result = [,,,1]

        // multiply from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = result[i + 1] * nums[i + 1];
        }
        // result = [       ,      , 1*4, 1]
        // result = [       , 1*4*3, 1*4, 1]
        // result = [1*4*3*2, 1*4*3, 1*4, 1]

        int leftNum = 1;
        // multiply from left to right
        for (int i = 0; i < nums.length; i++) {
            result[i] = result[i] * leftNum;
            leftNum = leftNum * nums[i];
        }
        // result = [1*4*3*2*1, 1*4*3,     1*4,       1        ]; leftNum = 1*1
        // result = [1*4*3*2*1, 1*4*3*1*1, 1*4,       1        ]; leftNum = 1*1*2
        // result = [1*4*3*2*1, 1*4*3*1*1, 1*4*1*1*2, 1        ]; leftNum = 1*1*2*3
        // result = [1*4*3*2*1, 1*4*3*1*1, 1*4*1*1*2, 1*1*1*2*3]; leftNum = 1*1*2*3*4

        System.out.println("The output array is " + Arrays.toString(result));
        return result;
    }
}
