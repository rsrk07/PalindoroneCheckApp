/**
 * ============================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and compared
 * by removing elements from both ends:
 *   - removeFirst()
 *   - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * ============================================================
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindoroneCheckApp {

    /**
     * Application entry point for UC7
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last  = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}