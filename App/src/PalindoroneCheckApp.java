/**
 * ============================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and compared by
 * removing elements from both ends:
 *   - removeFirst()
 *   - removeLast()
 *
 * Demonstrates how LinkedList supports double-ended
 * operations for symmetric validation.
 * ============================================================
 */

import java.util.LinkedList;

public class PalindoroneCheckApp {

    /**
     * Application entry point for UC8
     * @param args Command-line arguments
     */
    public static String check(String input){

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        String isPalindrome = "true";

        // Compare characters from both ends
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last  = list.removeLast();

            if (first != last) {
                isPalindrome = "false";
                break;
            }
        }
        return isPalindrome ;
    }
    public static void main(String[] args) {

        // Define the input string
        String input = "level";
        String isPalindrome =check(input);
        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}