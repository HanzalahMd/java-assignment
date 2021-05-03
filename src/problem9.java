// How do I determine whether an array contains a particular value in Java?

package assignment;


import java.util.Scanner;

public class problem9 {

    //To check a value in an array
    // Use Linear Search
    public static boolean check (String[] arrayToBeChecked, String valueToBeChecked) {
        for (String test:
             arrayToBeChecked) {
            if (test.equals(valueToBeChecked)) { // String uses equals() instead 0f "=="
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] testArray = {"John", "Sam", "Alex", "Amit"};

        Scanner refScanner = new Scanner(System.in);
        System.out.println("What value you want to be checked?");
        String checkValue = refScanner.nextLine(); // Insert your value that need to be checked

        System.out.println(check(testArray, checkValue)); // calls the check method
    }
}
