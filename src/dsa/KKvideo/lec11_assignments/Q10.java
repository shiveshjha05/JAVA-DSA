package dsa.KKvideo.lec11_assignments;

// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num = sc.nextInt();
        checkPalindrome(num);
    }

    static void checkPalindrome(int a) {
        int original = a;
        int reverse = 0;
        int digit;
        while(a > 0) {
            digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }

        if(original == reverse) {
            System.out.println("Given number is a palindrome.");
        }
        else {
            System.out.println("Given number is not a palindrome.");
        }
    }
}
