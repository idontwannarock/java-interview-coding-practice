package ampos.lance;

public class GetMatchingParenthesisIndex {

    public static void main(String[] args) {
        // Get the index of right parenthesis for the matching left parenthesis. e.g. a_str = "(((())))((((()))))"
        String parentheses = "(((())))((((()))))";
        int nthOccurrenceOfPickedParenthesis = 3;

        // Solution:
        for (int occurrenceOfPickedLeftParenthesis = 0, flag = 0, index = 0; index < parentheses.length(); index++) {
            if (parentheses.charAt(index) == '(') occurrenceOfPickedLeftParenthesis++;
            if (occurrenceOfPickedLeftParenthesis >= nthOccurrenceOfPickedParenthesis) {
                if (parentheses.charAt(index) == '(') flag++;
                if (parentheses.charAt(index) == ')') flag--;
                if (flag == 0) {
                    System.out.println("The index of right parenthesis for the matching " + nthOccurrenceOfPickedParenthesis + "th left parenthesis is " + index);
                    break;
                }
            }
            if (index == parentheses.length() - 1 && flag > 0)
                System.out.println("There is no matching right parenthesis for " + nthOccurrenceOfPickedParenthesis + "th left parenthesis.");
        }
    }
}
