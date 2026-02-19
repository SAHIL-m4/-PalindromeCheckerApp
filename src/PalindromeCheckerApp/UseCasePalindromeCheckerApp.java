package PalindromeCheckerApp;

import java.util.Scanner;
public class UseCasePalindromeCheckerApp {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your string : ");
         String input = scanner.nextLine();
         boolean isPalindrome=true;
         String correct = input.toLowerCase();
         int length = correct.length();
         for(int i=0;i<input.length()/2;i++) {
             if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                 isPalindrome = false;
                 break;
             }
         }
         System.out.println("------");
         System.out.println("PALINDROME CHECKING...............");
         if(isPalindrome){
             System.out.println("-> is palindrome");
         }else{
             System.out.println("-> NOT palindrome");
         }
         scanner.close();
    }
}




