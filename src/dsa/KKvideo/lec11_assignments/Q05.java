package dsa.KKvideo.lec11_assignments;

// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number :- ");
        int num1 = sc.nextInt();
        System.out.print("Input second number :- ");
        int num2 = sc.nextInt();
        int result = product(num1, num2);
        System.out.println("Product = " + result);
    }

    static int product(int a, int b) {
        return a * b;
    }

}
