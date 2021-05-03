package assignment;

import java.util.ArrayList;

public class Problem13 {

    public static void main(String[] args) {

        int[] duplicateList = {20, 20, 30, 40, 50, 50, 50};

        ArrayList<Integer> noDuplicateList = new ArrayList<>(); // Create new temporary list

        for (int element:duplicateList) { // Check every element in a list
            if(!noDuplicateList.contains(element)){ //check for duplicates,
                noDuplicateList.add(element); // only add the element if it's not exists.
            }
        }

        System.out.println(noDuplicateList.size());
    }
}
