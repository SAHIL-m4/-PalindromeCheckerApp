
public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded string literal
        String input = "madam";
        boolean isPalindrome = true;
        
        // Loop only till half of the string length as per hint
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character at index 'i' with character at symmetric index from the end
            // Formula: length - 1 - i
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Conditional statement to display the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}