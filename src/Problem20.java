// Problem 20
// Palindrome String

import java.util.Scanner;

public class Problem20 {

    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
    public static void main(String[] args) {

        // get the string input from the user
        Scanner refScanner = new Scanner(System.in);
        System.out.println("Welcome to String Palindrome!!!");
        System.out.println("Enter a string to be checked:");
        String userInput = refScanner.next();

        if (isPalindrome(userInput))
            System.out.print("Yes, " + userInput + " is a palindrome");
        else
            System.out.print("Nope, " + userInput + " is not a palindrome");
    }
}
