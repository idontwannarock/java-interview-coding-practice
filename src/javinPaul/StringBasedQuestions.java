package javinPaul;

public class StringBasedQuestions {

    // 1. How do you reverse a given string in place?
    public String reverseString1(String input) {
        String[] inputArray = input.split("");
        String output = "";
        for (int index = inputArray.length - 1; index >= 0; index--) {
            output += inputArray[index];
        }
        return output;
    }

    public String reverseString2(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // 2. How do you print duplicate characters from a string?
    // 3. How do you check if two strings are anagrams of each other?
    // 4. How do you find all the permutations of a string?
    // 5. How can a given string be reversed using recursion?
    // 6. How do you check if a string contains only digits?
    // 7. How do you find duplicate characters in a given string?
    // 8. How do you count a number of vowels and consonants in a given string?
    // 9. How do you count the occurrence of a given character in a string?
    // 10. How do you print the first non-repeated character from a string?
    // 11. How do you convert a given String into int like the atoi()?
    // 12. How do you reverse words in a given sentence without using any library method?
    // 13. How do you check if two strings are a rotation of each other?
    // 14. How do you check if a given string is a palindrome?
    // 15. How do you find the length of the longest substring without repeating characters?
    // 16. Given string str, How do you find the longest palindromic substring in str?
    // 17. How to convert a byte array to String?
    // 18. how to remove the duplicate character from String?
    // 19. How to find the maximum occurring character in given String?
    // 20. How do you remove a given character from String?
}
