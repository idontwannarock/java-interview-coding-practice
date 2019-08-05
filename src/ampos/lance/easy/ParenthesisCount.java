package ampos.lance.easy;

public class ParenthesisCount {

    public int parenthesisCount(String input) {
        // Implement method input string and return number of parenthesis count in that string.
        // In case parenthesis pair is missing or invalid, the method return -1.
        int leftParenthesisCount = 0;
        int rightParenthesisCount = 0;
        for (String character : input.split("")) {
            if (character.equals("(")) leftParenthesisCount++;
            if (character.equals(")")) rightParenthesisCount++;
        }
        if (leftParenthesisCount != rightParenthesisCount) return -1;
        return leftParenthesisCount;
    }
}
