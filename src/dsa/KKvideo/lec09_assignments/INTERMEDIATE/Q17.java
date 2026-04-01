package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Find if a number is palindrome or not

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;
        int digit;
        while(num > 0) {
            digit = num%10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(original == reverse) {
            System.out.println("Given number is a palindrome.");
        }
        else {
            System.out.println("Given number is not a palindrome.");
        }
    }
}
