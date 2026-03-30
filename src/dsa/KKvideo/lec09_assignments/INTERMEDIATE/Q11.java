package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

import java.util.Scanner;

// Compound Interest Java Program

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P = ");
        double p = sc.nextDouble();
        System.out.print("Enter R = ");
        double r = sc.nextDouble();
        System.out.print("Enter T = ");
        double t = sc.nextDouble();

        double A = p * Math.pow((1 + r / 100), t);
        double CI = A - p;

//      System.out.println("Compound interest = " + CI);  OR
        System.out.printf("CI = %.2f\n", CI);

    }
}
