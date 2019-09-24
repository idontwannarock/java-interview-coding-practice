package ampos.howard;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Easy2 {

    // When climbing a stair, you can either take 1 step or 2 steps.
    // Implement a method easy2 that given a number of steps of a stair, returns how many distinct ways to reach the top.
    //
    // Example
    // Input: 3
    // Output: 3
    //
    // 1. 1 step + 1 step + 1 step
    // 2. 1 step + 2 steps
    // 3. 2 steps + 1 step

    public int easy2(int stairs) {
        // Implement easy#2 question here

        throw new NotImplementedException();
    }

    // ways(n) = ways(n-1) + ways(n-2)
    // ways(3) = ways(2) + ways(1)
}
