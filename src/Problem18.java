// Problem 18
// Program to Check Armstrong Number (0 - 999)
// Armstrong number is the sum of cubes of all its digits

package assignment;

import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args)  {

        Scanner refScanner = new Scanner(System.in);
        System.out.println("Welcome to Armstrong!!!");
        System.out.println("Enter a number to be checked:");
        int userInput = refScanner.nextInt();

        // Declare your variables
        int a; // for every single digit in the given number
        int c = 0;
        int n = userInput;
        int numOfLoops = 0;
        int[] array1 = new int[3];

        while(n>0)
        {
            // First step is to check every single digit in the number.
            // the loop will check the digit starting from the last.
            a = n % 10;
//            System.out.println("Number to be checked now: " + a);

            // Second step is to calculate the sum of cubes of all its digits.
            // first loop: total = 0 + (third digit ^ 3)
            // second loop: total = total + (second digit ^ 3)
            // final loop: total = total + (first digit ^ 3)
//            System.out.println("Total = " + c + " (previous total) + ( " + a + " * " + a + " * " + a + ")");
            c = c + (a * a * a);
            array1[numOfLoops] = a * a * a;
            System.out.println("( " + a + " * " + a + " * " + a + ") = " + array1[numOfLoops]);
            numOfLoops++;

            // Third step is to move to the next digit by dividing it with 10.
            n = n / 10;
//            System.out.println("Remaining digits: " + n + "\n");
        }
        System.out.println(array1[0] + " + " + array1[1] + " + " + array1[2] + " = " + c);
        if(c == userInput) {
            System.out.println(c + " (sum of cubes of all its digits) == " + userInput + " (user input)" );
            System.out.println(userInput + " is an armstrong number.");
        } else {
            System.out.println(c + " (sum of cubes of all its digits) != " + userInput + " (user input)");
            System.out.println(userInput + " is not an armstrong number.");
        }
    }
}
