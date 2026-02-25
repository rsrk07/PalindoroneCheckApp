import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS : UseCase12PalindromeCheckerApp
 *
 * Use Case 12 : Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates how different palindrome algorithms
 * can be selected dynamically at runtime using the
 * Strategy Design Pattern.
 * ============================================================
 */

public class PalindoroneCheckApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute selected strategy
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * ============================================================
 * INTERFACE : PalindromeStrategy
 *
 * Defines a contract for all palindrome algorithms.
 * Any new algorithm must implement this interface.
 * ============================================================
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * ============================================================
 * CLASS : StackStrategy
 *
 * Stack-based palindrome validation.
 * Uses LIFO behaviour to reverse characters.
 * ============================================================
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {

        // Create stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}