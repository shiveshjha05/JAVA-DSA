package dsa.KKvideo.lec09_assignments.BASIC;

// Addition Of Two Numbers

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :- ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

    }
}
