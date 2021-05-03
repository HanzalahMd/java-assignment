package assignment;

import java.io.IOException;

public class Problem3 {

    public static void main(String[] args) throws IOException {

        InputReader refReader = new InputReader();
        int numOfRows = refReader.getNumOfRows();

        int asciiValue = 65; // Initial value is 65 which is 'A'
        for(int i = 1; i <= numOfRows; i++){
            for(int j = 0; j < i; j++ ){
                char currentChar = (char) asciiValue; // convert ascii to char.
                System.out.print(currentChar);
            }
            asciiValue++; // increment the ascii value to change alphabet
            System.out.println();
        }
    }
}