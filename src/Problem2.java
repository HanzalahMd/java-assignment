package assignment;

import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) throws IOException {

        InputReader refReader = new InputReader();
        int numOfRows = refReader.getNumOfRows();

        int currentNumber = 1;
        for(int i = 1; i <= numOfRows; i++){
            for(int j = 0; j < i; j++ ){
                System.out.print(currentNumber);
                currentNumber++;
            }
            currentNumber = 1;
            System.out.println();
        }
    }
}