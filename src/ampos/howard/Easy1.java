package ampos.howard;

public class Easy1 {

    // Implement a method easy1 that given an integer array, which each element appears twice except for one.
    // Find that one.
    // You must solve it with O(n) time-complexity.
    //
    // Example #1
    // Input: [1, 1, 2, 2, 3]
    // Output: 3
    //
    // Example #2
    // Input: [-1, 2, 4, 2, -1]
    // Output: 4
    //
    // (Optional) bonus point: solve with O(1) space-complexity

    public int easy1(int[] nums) {
        // Implement easy#1 question here
        int base = 0;
        for (int num : nums) {
            // Using bitwise manipulation, XOR
            base = base ^ num;
        }
        System.out.println("The integer that appears once is " + base);
        return base;
    }
}
