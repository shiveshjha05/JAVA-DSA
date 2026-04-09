package dsa.KKvideo.lec11_assignments;

// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number :- ");
        int num1 = sc.nextInt();
        System.out.print("Input second number :- ");
        int num2 = sc.nextInt();
        int result = sum(num1, num2);
        System.out.println("Sum = " + result);
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
