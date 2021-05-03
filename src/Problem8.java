package assignment;

import java.io.IOException;

public class Problem8 {
    public static void main(String[] args) throws IOException {

        InputReader refReader = new InputReader();
        int numOfRows = refReader.getNumOfRows();

        for(int i = numOfRows; i >= 0; i--) {
            if (i == 1 || i % 2 == 0) {
                for (int j = i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }
    }
}