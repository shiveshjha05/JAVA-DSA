package dsa.KKvideo.lec11_assignments;

// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number :- ");
        int num2 = sc.nextInt();

        findPrime(num1, num2);
    }

    static void findPrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int a) {
        if (a <= 1) return false;

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}