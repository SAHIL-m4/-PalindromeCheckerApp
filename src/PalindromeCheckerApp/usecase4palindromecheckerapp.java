package PalindromeCheckerApp;

public class usecase4palindromecheckerapp {
    public static void main(String[] args) {
        String text = "MADAM";
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Is Palindrome: " + isPalindrome);
        } else {
            System.out.println("noo palidrome ##");
        }
    }
}