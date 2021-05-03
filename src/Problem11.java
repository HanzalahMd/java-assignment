// Problem 11
// Remove duplicate elements(String/int) from an array

import java.util.ArrayList;
import java.util.Collections;

public class Problem11 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 4, 3, 2, 1); // input sample values to be checked

        ArrayList<Integer> noDuplicateList = new ArrayList<>(); // Create new temporary list

        for (int element:list) { // Check every element in a list
            if(!noDuplicateList.contains(element)){ //check for duplicates,
                noDuplicateList.add(element); // only add the element if it's not exists.
            }
        }

        System.out.println(noDuplicateList); // prints out the noDuplicate array
    }
}
