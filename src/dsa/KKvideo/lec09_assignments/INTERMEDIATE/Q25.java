package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 31;
        int count = 0;
        for(int i = 2; i <= 31 ; i += 2) {
            count++;
        }
        System.out.println("No. of the days Kunal can go out with his friends in Aug = " + count);

    }
}
