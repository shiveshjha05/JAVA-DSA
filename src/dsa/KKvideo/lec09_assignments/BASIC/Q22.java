package dsa.KKvideo.lec09_assignments.BASIC;

// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        System.out.print("Enter the number :- ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int pro = 1;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            pro = pro * digit;
            num = num/10;
        }

        int result = pro - sum;
        System.out.println("Result = " + result);

    }
}
