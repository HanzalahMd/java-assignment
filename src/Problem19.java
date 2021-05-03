// Problem 19
// Palindrome

package assignment;

import java.util.Scanner;

public class Problem19 {

    public static void main(String[] args) {

        Scanner refScanner = new Scanner(System.in);
        System.out.println("Welcome to Palindrome!!!");
        System.out.println("Enter a number to be checked:");
        int userInput = refScanner.nextInt();

        int r;
        int sum=0;
        int n= userInput;//It is the number variable to be checked for palindrome

        System.out.print("The reverse number is: ");
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
            System.out.print(r);
        }
        System.out.println();
        if(sum == userInput)
            System.out.println(userInput + " is a palindrome number ");
        else
            System.out.println(userInput + " is not a palindrome");
    }
}
