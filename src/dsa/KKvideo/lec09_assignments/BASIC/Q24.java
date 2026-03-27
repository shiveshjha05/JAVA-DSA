package dsa.KKvideo.lec09_assignments.BASIC;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        System.out.print("Enter the number :- ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int sum = 0;

        while(input != 0) {
            sum = sum + input;
            input = in.nextInt();
        }

        System.out.println("Required output is = " + sum);

    }
}
