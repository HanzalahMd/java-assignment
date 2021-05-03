// Problem 7
// 1
// 232
// 34543
// 4567654
// 567898765

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("What is the max index number?");
        int numOfIndex = refScanner.nextInt();

        // Declare 2 variable, 'row' is for the outer loop and 'changeNumber' is for the inner loop
        int row = 1; // row number will start with 1
        for(int i = 1; i <= numOfIndex; i++) { // index ends with user input number

            if (i % 2 == 0) { // skips the index divisible by 2
                continue;
            }

            int changeNumber = row; // the inner number will get the current row number

            while (changeNumber < i) { // will run this until changeNumber == outer loop index number
                System.out.print(changeNumber);
                changeNumber++; // increment by 1
            }

            while (changeNumber > row){ // will run this until changeNumber == current row number
                System.out.print(changeNumber);
                changeNumber--; // decrement by 1
            }
            System.out.print(changeNumber);

            row++; // increment row number by 1 for each outer loop
            System.out.println(); // prints empty space
        } // outer for loop
    }
}
