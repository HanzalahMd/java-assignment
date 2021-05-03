// Problem 8
// ********
// ******
// ****
// **
// *

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int numOfRows = refScanner.nextInt();

        for(int i = numOfRows; i >= 0; i--) { // index starts with user input number
            if (i == 1 || i % 2 == 0) { // skips the index 1 and index divisible by 2
                for (int j = i; j > 0; j--) {
                    System.out.print("*");
                } // end of inner loop
                System.out.println("\n");
            }
        } // end of outer loop
    }
}