package dsa.KKvideo.lec11_assignments;

// Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num = sc.nextInt();
        factorial(num);
    }
    static void factorial(int a) {
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
}
