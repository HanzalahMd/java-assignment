// Problem 5
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int numOfRows = refScanner.nextInt();

        int currentNumber = 1;
        for(int i = numOfRows; i >= 0; i--){ // index starts with user input number
            for(int j = i; j > 0; j--){
                System.out.print(currentNumber);
                currentNumber++;
            } // end of inner loop
            currentNumber = 1;
            System.out.println();
        } // end of outer loop
    }
}