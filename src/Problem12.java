// Problem 12
// Find the second largest and second smallest element in an array

import java.util.Arrays;

public class Problem12 {

    public static void main(String[] args) {

        int temp, count;
        int[] array = {1, 3, 2, 9, 4, 6, 5, 8, 7}; // create a sample array
        System.out.println(Arrays.toString(array)); // prints the unsorted array.
        count = array.length;

//        // Complex version
//        // Sort the numbers in an ascending order
//        for (int i = 0; i < count; i++){ // check every element in array.
//            for (int j = i + 1; j < count; j++){ // index j is the next index of i.
//                if(array[i] > array[j]){ // swap the numbers if index i is smaller than in index j.
//                    temp = array[i]; // store the value needed to be swapped in the temp variable
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        // Non complex Version
        // Sort the numbers in an ascending order
        Arrays.sort(array);

        System.out.println(Arrays.toString(array)); // prints the sorted array.
        System.out.println(array[1]); // Index 1 prints the second smallest number.
        System.out.println(array[count - 2]); // [array.length - 2] prints the second largest.
    }
}
