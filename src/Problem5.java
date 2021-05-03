package assignment;

import java.io.IOException;

public class Problem5 {

    public static void main(String[] args) throws IOException {

        InputReader refReader = new InputReader();
        int numOfRows = refReader.getNumOfRows();

        int currentNumber = 1;
        for(int i = numOfRows; i >= 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print(currentNumber);
                currentNumber++;
            }
            currentNumber = 1;
            System.out.println();
        }
    }
}