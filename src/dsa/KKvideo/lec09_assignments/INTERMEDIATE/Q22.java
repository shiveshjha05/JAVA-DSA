package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Perfect Number In Java

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == num) {
            System.out.println("Number is perfect.");
        }
        else {
            System.out.println("It's not a perfect number.");
        }
    }
}
