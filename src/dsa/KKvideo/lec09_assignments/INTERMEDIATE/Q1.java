package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int num = input.nextInt();
        int fact = 1;

        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
        }

        else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(num + "! = " + fact);
        }
    }
}
