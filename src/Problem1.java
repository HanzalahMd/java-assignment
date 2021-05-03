package assignment;

import java.io.IOException;

public class Problem1 {
    public static void main(String[] args) throws IOException {

        InputReader refReader = new InputReader();
        int numOfRows = refReader.getNumOfRows();

        for(int i = 1; i <= numOfRows; i++){
            for(int j = 0; j < i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}