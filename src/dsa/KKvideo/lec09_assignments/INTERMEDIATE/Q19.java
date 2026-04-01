package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// HCF Of Two Numbers Program

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :- ");
        int a = sc.nextInt();
        System.out.println("Enter the second number :- ");
        int b = sc.nextInt();
        int HCF = 1;
        for(int i = 1; i <= Math.min(a,b); i++) {
            if (a % i == 0 && b % i == 0){
            HCF = i;
            }
        }
        System.out.println("HCF = " + HCF);
    }
}
