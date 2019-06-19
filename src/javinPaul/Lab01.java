package javinPaul;

public class Lab01 {

    public static void main(String[] args) {
        // How do you reverse a given string in place?
        final String input = "123456";
        System.out.println("Input: " + input);
        String[] inputArray = input.split("");
        StringBuilder output = new StringBuilder();
        for (int index = inputArray.length - 1; index >= 0; index--) {
            output.append(inputArray[index]);
        }
        System.out.println("Output: " + output.toString());
    }
}
