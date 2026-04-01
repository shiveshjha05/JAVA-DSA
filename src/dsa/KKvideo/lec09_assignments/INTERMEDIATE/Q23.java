package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Check Leap Year Or Not 
// If divisible by 4, it should not be divisible by 100 to be a leap year.
// But if it is divisible by 400, then it is a leap year anyway.

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :- ");
        int year = sc.nextInt();
        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("not a leap year.");
        }
    }
}
