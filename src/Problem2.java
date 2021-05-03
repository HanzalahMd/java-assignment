import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){

        // Get the number of rows from the user input
        Scanner refScanner = new Scanner(System.in);
        System.out.println("How many rows?");
        int numOfRows = refScanner.nextInt();

        int currentNumber = 1; // starts with 1
        for(int i = 1; i <= numOfRows; i++){ // index ends with user input number
            for(int j = 0; j < i; j++ ){
                System.out.print(currentNumber);
                currentNumber++; // increment by 1
            } // end of inner loop
            currentNumber = 1; // every row must start with 1
            System.out.println();
        } // end of outer loop
    }
}