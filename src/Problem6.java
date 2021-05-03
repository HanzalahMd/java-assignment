// Problem 6 (Stars with spaces between each loop)
// *
// **
// ****
// ******
// ********

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int numOfRows = refScanner.nextInt();

        for(int i = 1; i <= numOfRows; i++){ // index ends with user input number
            if(i == 1 || i % 2 == 0){ // prints only 1 and number divisible by 2.
                for(int j = 0; j < i; j++ ){
                    System.out.print("*");
                } // end of inner loop
                System.out.println("\n"); // prints 1 empty line
            } // end of outer loop
        }
    }
}