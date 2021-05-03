// Problem 3
// A
// B B
// C C C
// D D D D
// E E E E E

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int numOfRows = refScanner.nextInt();

        int asciiValue = 65; // Initial value is 65 which is 'A'
        for(int i = 1; i <= numOfRows; i++){ // index ends with user input number
            for(int j = 0; j < i; j++ ){
                char currentChar = (char) asciiValue; // convert ascii to char.
                System.out.print(currentChar);
            } // end of inner loop
            asciiValue++; // increment the ascii value to change alphabet
            System.out.println();
        } // end of outer loop
    }
}