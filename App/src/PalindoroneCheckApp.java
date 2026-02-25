import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS : UseCase11PalindromeCheckerApp
 * Use Case 11 : Object-Oriented Palindrome Service
 *
 * Description:
 * Demonstrates palindrome validation using OOP design.
 * The palindrome logic is encapsulated inside
 * the PalindromeService class.
 * ============================================================
 */

public class PalindoroneCheckApp {

    /**
     * Application entry point for UC11
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call palindrome check
        boolean result = service.checkPalindrome(input);

        // Display result
        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Handle null or empty string
        if (input == null) {
            return false;
        }

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}