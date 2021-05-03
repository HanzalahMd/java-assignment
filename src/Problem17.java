// Factorial
// eg: n = 6
// 6 * 5 * 4 * 3 * 2 * 1 = 720

package assignment;

import java.util.Scanner;

public class Problem17 {

    public static void main(String[] args) {

        Scanner refScanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.println("Enter a number:");
        int userInput = refScanner.nextInt();

        int total = 1; // set to 1, so the first multiplication will be: userInput * 1.

        for(int n = userInput; n >= 1; n--){ // n starts with userInput, and ends with 1.
            if(n > 1){
                System.out.print(n + " * "); // all the numbers will append the multiple sign.
                total *= n; // total is multiplied with the current .
            } else { // Last number will end with equal sign.
                System.out.print(n + " = ");
            }
        }
        System.out.print(total);
    }
}
