package ampos.lance;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CountCombination {

    public static void main(String[] args) {
        // Print all the combination of 7 balls each with different colors with or w/out considering the order.
        // Assuming they are red, orange, yellow, green, blue, indigo, purple.

        // Solution
        for (byte combinationCount = 0; combinationCount >= 0; combinationCount++) {
            String[] combinationArray = convertByteToBinaryString(combinationCount).split("");
            System.out.println("Base binary: " + Arrays.toString(combinationArray));

            LinkedList<ColorBall> combinations = new LinkedList<>();
            for (int index = 0; index < combinationArray.length; index++) {
                // Produce combination of ColorBalls with order
                if (combinationArray[index].equals("1") ) combinations.add(ColorBall.ofIndex(index));
            }

            for (int rotate = 0; rotate < combinations.size(); rotate++) {
//                if (combinations.size() != 0) {
                    // Print current color ball by order
                    System.out.print("Combination: ");
                    printCombination(combinations);
                    // rotate current combination
                    combinations.addFirst(combinations.removeLast());
//                }
            }
            System.out.println();
        }
    }

    private static String convertByteToBinaryString(byte number) {
        // 0xFF (Hex) = 1111 1111 (Binary); 0x100 = 1 0000 0000
        // Because all the zeros ahead will be reduced in toBinaryString function
        // so we first need to convert to hex number and add a 1 in 9th place to keep all the zeros behind it
        // and then substring the first digit in the front
        return Integer.toBinaryString((number & 0xFF) + 0x100).substring(1);
    }

    private static void printCombination(List<ColorBall> combinations) {
        System.out.print("[");
        combinations.forEach(ball -> {
            System.out.print(ball.name());
            if (combinations.indexOf(ball) != combinations.size() - 1) System.out.print(", ");
        });
        System.out.println("]");
    }

    enum ColorBall {
        RED(1), ORANGE(2), YELLOW(3), GREEN(4), BLUE(5), INDIGO(6), PURPLE(7);

        int index;

        ColorBall(int index) {
            this.index = index;
        }

        static ColorBall ofIndex(int index) {
            for (ColorBall ball : ColorBall.values()) {
                if (ball.index == index) return ball;
            }
            return null;
        }
    }
}
