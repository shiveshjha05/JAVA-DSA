package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Sum Of N Numbers

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no. of inputs :- ");
        int n = sc.nextInt();
        System.out.println("Enter the inputs :- ");
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum = " + sum);
    }
}
