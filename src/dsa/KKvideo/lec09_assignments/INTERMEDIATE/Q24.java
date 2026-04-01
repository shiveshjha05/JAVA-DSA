package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Sum Of A Digits Of Number

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("Sum of the digits of the given number = " + sum);
    }
}
