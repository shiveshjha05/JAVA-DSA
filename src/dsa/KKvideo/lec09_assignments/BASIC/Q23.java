package dsa.KKvideo.lec09_assignments.BASIC;

// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = input.nextInt();

        System.out.print("Factors are :- ");

        for(int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
