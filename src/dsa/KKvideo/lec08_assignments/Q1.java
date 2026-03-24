package dsa.KKvideo.lec08_assignments;

// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number:- ");
        int number = input.nextInt();

        if(number % 2 == 0 ) {
            System.out.println("Given number is even.");
        }
        else {
            System.out.println("Given number is odd.");
        }

    }
}
