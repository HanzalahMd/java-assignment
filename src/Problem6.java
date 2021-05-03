package assignment;

import java.io.IOException;

public class Problem6 {

    public static void main(String[] args) throws IOException {

        InputReader refReader = new InputReader();
        int numOfRows = refReader.getNumOfRows();

        for(int i = 1; i <= numOfRows; i++){
            if(i == 1 || i % 2 == 0){ // prints only 1 and number divisible by 2.
                for(int j = 0; j < i; j++ ){
                    System.out.print("*");
                }
                System.out.println("\n"); // prints 1 empty line
            }
        }
    }
}