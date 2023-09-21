/**
 * An Application class to test the Palindrome class and its method
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 2.2 - Palindrome
 * Fall/2023
 */

public class Application {
    public static void main(String[] args) throws Exception {
        String palindrome = "Was it a car or a cat I saw";
        String notPalindrome = "Marti";

        System.out.println("Input String: " + palindrome);
        System.out.println("Is it a palindrome: " + Palindrome.testPalindrome(palindrome));
        
        System.out.println("Input String: " + notPalindrome);
        System.out.println("Is it a palindrome: " + Palindrome.testPalindrome(notPalindrome));
    }
}
