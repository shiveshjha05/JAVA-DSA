package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate Average Of N Numbers

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = input.nextInt();
        int sum = 0;
        int num;

        if (n == 0) {
            System.out.println("Cannot calculate average!");
        }

        else {
            System.out.print("Enter the " + n + " numbers :- ");
            for(int i = 1; i <=n ; i++) {
                num = input.nextInt();
                sum = sum + num;
            }

            double result = (double) sum / n;
            System.out.println("Average = " + result);
        }

    }
}
