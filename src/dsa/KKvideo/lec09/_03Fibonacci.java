package dsa.KKvideo.lec09;

import java.util.Scanner;

public class _03Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the value of n :- ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0, b = 1;

        for(int i = 0; i < n; i++){
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;

        }
    }
}