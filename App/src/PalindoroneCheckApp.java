/**
 * ============================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 *  - Queue (FIFO - First In First Out)
 *  - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is a palindrome.
 *
 * ============================================================
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindoroneCheckApp {

    /**
     * Application entry point for UC6
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both Queue and Stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // Enqueue
            stack.push(c);  // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}