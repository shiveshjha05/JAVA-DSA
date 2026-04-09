package dsa.KKvideo.lec11_assignments;

// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input age :- ");
        int age = sc.nextInt();
//        checkAge(age);
        // OR
        boolean result = checkAge(age);
        if(result) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }

//    static void checkAge(int a) {
//        if(a >= 18) {
//            System.out.println("Eligible to vote.");
//        }
//        else {
//            System.out.println("Not eligible to vote.");
//        }
//    }

    // OR

    static boolean checkAge(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
