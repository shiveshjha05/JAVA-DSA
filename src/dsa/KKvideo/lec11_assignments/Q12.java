package dsa.KKvideo.lec11_assignments;

// Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean result = check(num1, num2, num3);

        if (result) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }

    static boolean check(int a, int b, int c) {

        // Step 1: Validation
        if (a <= 0 || b <= 0 || c <= 0) return false;

        // Step 2: Find largest
        int max = Math.max(a, Math.max(b, c));

        // Step 3: Apply Pythagoras
        if (max == a) {
            return (a * a) == (b * b + c * c);
        } else if (max == b) {
            return (b * b) == (a * a + c * c);
        } else {
            return (c * c) == (a * a + b * b);
        }
    }
}