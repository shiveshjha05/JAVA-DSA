package dsa.KKvideo.lec08_assignments;

// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:- ");
        int start = input.nextInt();

        System.out.print("Enter last number:- ");
        int end = input.nextInt();

        System.out.print("Armstrong numbers between given two numbers are: ");

        for (int num = start; num <= end; num++) {

            int original = num;

            // count digits
            int count = 0;
            int temp = num;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            // calculate sum
            int sum = 0;
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (int)Math.pow(digit, count);
                temp = temp / 10;
            }

            // check
            if (sum == original) {
                System.out.print(original + " ");
            }
        }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter start: ");
//        int start = sc.nextInt();
//
//        System.out.print("Enter end: ");
//        int end = sc.nextInt();
//
//        System.out.print("Armstrong numbers are: ");
//
//        for (int num = start; num <= end; num++) {
//
//            int original = num;
//            int sum = 0;
//
//            int digits = String.valueOf(num).length(); // easy digit count
//
//            int temp = num;
//
//            while (temp > 0) {
//                int digit = temp % 10;
//                sum = sum + (int)Math.pow(digit, digits);
//                temp = temp / 10;
//            }
//
//            if (sum == original) {
//                System.out.print(original + " ");
//            }
//        }
    }
}
