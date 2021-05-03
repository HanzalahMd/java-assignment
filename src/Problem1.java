// Problem 1

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int numOfRows = refScanner.nextInt();

        for(int i = 1; i <= numOfRows; i++){ // index ends with user input number
            for(int j = 0; j < i; j++ ){
                System.out.print("*");
            } // end of inner loop
            System.out.println(); // print empty line for each outer loop
        } // end of outer loop
    }
}