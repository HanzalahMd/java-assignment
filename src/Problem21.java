package assignment;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner refScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = refScanner.nextInt();
        int finalTotal = 0;

        for(int i = 1; i <= number; i++){
            int total = (int) Math.pow(i, i);
            System.out.println(i + "^" + i + "= " + total);

            finalTotal += total;
        }
        System.out.println("Total: " + finalTotal);
    }
}
