import java.util.Stack;

/**
 * A class containing a method to test if a string is a palindrome or not
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 2.2 - Palindrome
 * Fall/2023
 */
public class Palindrome {

    /**
     * Static method to check if a given string is a palindrome.
     *
     * @param stringToCheck The string to be checked for palindrome.
     * @return True if the input string is a palindrome, false otherwise.
     */
    public static boolean testPalindrome(String stringToCheck) {

        // Convert the input string to lowercase and convert to a character array
        char[] charr = stringToCheck.toLowerCase().toCharArray();
        
        // Create a stack to store the characters
        Stack<Character> charStack = new Stack<>();
        
        // Iterate through the characters and push characters that are in the alphabet to the stack
        for (char charToAdd: charr) {
            if (charToAdd >= 'a' && charToAdd <= 'z') // Check if character is alphabetic
                charStack.push(charToAdd);
        }
        
        // Compare characters to the ones in the stack
        for(int i = 0; i <= charr.length/2; i++ ) { //Only compare half the string
            // Skip non-alphabetic characters in the input string
            if (charr[i] < 'a' || charr[i] > 'z')
                continue;
            System.out.println(charr[i]);
            // If characters don't match, return false
            if (charr[i] != charStack.pop()) 
                return false; // Not a palindrome
        }
        
        // If we made it here, we know its a palindrome
        return true; 
    }
}
