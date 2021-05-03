// Find common value in 3 sorted arrays.

package assignment;

import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 10, 20, 40, 80, 234, 7654, 99};
        int[] array2 = {6, 7, 20, 80, 100, 234, 1, 99};
        int[] array3 = {3, 4, 15, 20, 30, 70, 80, 120, 7654, 1, 99};

        ArrayList<Integer> commonValue = new ArrayList<>(); // create arraylist to store all the common values.

        for (int valueArray1 : array1) { // check every element in array1
            for (int valueArray2 : array2) { // check every element in array2
                if (valueArray1 == valueArray2) { // If the value in array1 is the same in array2, then check with array3 below:
                    for (int valueArray3 : array3) { // Check every element in array3.
                        if (valueArray1 == valueArray3) { // if the value in array3 is the same as the value in sameValue,
                            commonValue.add(valueArray1); // then add the value inside commonValue Arraylist.
                        }
                    }
                }
            }
        }
        System.out.println("The common values are: " + commonValue);
    }
}
