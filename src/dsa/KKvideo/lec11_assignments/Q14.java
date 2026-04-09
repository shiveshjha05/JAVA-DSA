package dsa.KKvideo.lec11_assignments;

// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n :- ");
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println("Sum = " + result);
    }

    static int sum(int a) {
        int sum = 0;
        for(int i = 1 ; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
