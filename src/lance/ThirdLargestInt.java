package lance;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ThirdLargestInt {

    public static void main(String[] args) {
        // Get the third largest integer within a list of integer
        Random random = new Random();

        // Solution 1: sort with descend order and get the third integer in the sorted list.
        List<Integer> integers = random.ints(6, 0, 51).boxed().collect(Collectors.toList());
        System.out.println(integers);
        integers.sort(Comparator.reverseOrder());
        System.out.println("[Solution 1] The third largest integer in the list is " + integers.get(2));

        // Solution 2: iterate through the list and keep track of three largest integers.
        integers = random.ints(6, 0, 51).boxed().collect(Collectors.toList());
        System.out.println(integers);
        int largestInt = Integer.MIN_VALUE;
        int secondLargestInt = Integer.MIN_VALUE;
        int thirdLargestInt = Integer.MIN_VALUE;
        for (int integer : integers) {
            if (integer > largestInt) {
                thirdLargestInt = secondLargestInt;
                secondLargestInt = largestInt;
                largestInt = integer;
            } else if (integer > secondLargestInt && integer != largestInt) {
                thirdLargestInt = secondLargestInt;
                secondLargestInt = integer;
            } else if (integer > thirdLargestInt && integer != secondLargestInt && integer != largestInt) {
                thirdLargestInt = integer;
            }
        }
        System.out.println("[Solution 2] The third largest integer in the list is " + thirdLargestInt);
    }
}
