import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS : UseCase13PalindromeCheckerApp
 *
 * Use Case 13 : Performance Comparison
 *
 * Description:
 * Measures and compares execution performance of
 * palindrome validation algorithms.
 *
 * Steps:
 *  - Uses palindrome strategy implementation
 *  - Captures execution start and end time
 *  - Calculates execution duration
 *  - Displays benchmarking results
 * ============================================================
 */

public class PalindoroneCheckApp {

    /**
     * Application entry point for UC13
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Choose algorithm (Stack Strategy here)
        PalindromeStrategy strategy = new StackStrategy();

        // Start time
        long startTime = System.nanoTime();

        // Execute algorithm
        boolean result = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Output
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based palindrome algorithm
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}