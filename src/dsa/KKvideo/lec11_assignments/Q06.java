package dsa.KKvideo.lec11_assignments;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius :- ");
        int radius = sc.nextInt();
        findPerArea(radius);

    }

    static void findPerArea(int a) {
        double peri = 2 * Math.PI * a;
        double are = Math.PI * a * a;
        System.out.printf("Perimeter = %.2f\n", peri);
        System.out.printf("Area = %.2f\n", are);
    }
}
