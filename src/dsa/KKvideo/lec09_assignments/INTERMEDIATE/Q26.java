package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input :- " );
        int num = sc.nextInt();

        int sumN = 0;
        int sumE = 0;
        int sumO = 0;

        while (num != 0) {
            if(num < 0) {
                sumN = sumN + num;
            }
            else if (num % 2 == 0) {
                sumE = num + sumE;
            }
            else {
                sumO = num + sumO;
            }
            num = sc.nextInt();
        }
        System.out.println("Negative no. sum = " + sumN);
        System.out.println("Positive even no. sum = " + sumE);
        System.out.println("Positive odd no. sum = " + sumO);
    }
}
