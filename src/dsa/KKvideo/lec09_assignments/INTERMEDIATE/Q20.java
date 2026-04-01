package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// LCM Of Two Numbers

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :- ");
        int a = sc.nextInt();
        System.out.println("Enter the second number :- ");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("LCM = 0");
            return;
        }

        int i = Math.max(a,b);
        while(true) {
            if( i % a == 0 && i % b == 0 ) {
                System.out.println("LCM = " + i);
                break;
            }
            i++;
        }
    }
}
