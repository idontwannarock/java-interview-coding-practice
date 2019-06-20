package javinPaul.stringBasedQuestions;

public class StringReverser {

    // 1. How do you reverse a given string in place?

    public String reverse(final String input) {
        if (input == null) throw new IllegalArgumentException("Input must not be null");
        char[] chars = new char[input.length()];
        for (int indexOfInput = input.length() - 1, index = 0; indexOfInput >= 0; indexOfInput--, index++) {
            chars[index] = input.charAt(indexOfInput);
        }
        return new String(chars);
    }

    // note: Java standard library class StringBuilder has reverse() method to more properly reverse any String, even in UTF-16.
}
