// Problem 7
// 1
// 232
// 34543
// 4567654
// 567898765

package assignment;

import java.io.IOException;

public class Problem7 {
    public static void main(String[] args) throws IOException {

        InputReader refReader = new InputReader();
        int numOfIndex = refReader.getNumOfIndex();

        int row = 1;
        for(int i = 1; i <= numOfIndex; i++) {

            if (i % 2 == 0) {
                continue;
            }

            int changeNumber = row;

            while (changeNumber < i) {
                System.out.print(changeNumber);
                changeNumber++;
            }

            while (changeNumber > row){
                System.out.print(changeNumber);
                changeNumber--;
            }
            System.out.print(changeNumber);

            row++;
            System.out.println();
        }
    }
}
