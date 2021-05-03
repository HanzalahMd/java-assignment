// Problem 16
// Generate Fibonacci Series.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

import java.util.Scanner;

public class Problem16 {

    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("Welcome to Fibonaci Generator!!");
        System.out.println("How many rows?");
        int numOfRows = refScanner.nextInt();

        int prevNumber = 0;
        int currentNumber = 0;
        int newNumber; // this will be calculated with the sum of current and previous number.

        for(int i = 0; i < numOfRows; i++){ // ends with the user input row
            if (i < 2){ // Prints the first 2 starting number
                System.out.println(i);
                currentNumber = i;
            } else {
                newNumber = currentNumber + prevNumber; // add the current number with the previous one.
                System.out.println(newNumber); // prints the new calculated number.
                prevNumber = currentNumber; // stores the current number in previous,
                currentNumber = newNumber; // and save the new number in the current.
            }
        }
    }
}
