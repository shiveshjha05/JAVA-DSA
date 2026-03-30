package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate Depreciation of Value

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Initial value = ");
        double ini = sc.nextDouble();
        System.out.print("Depreciation rate (in %) = ");
        int rate = sc.nextInt();
        System.out.print("Time (in year) = ");
        int time = sc.nextInt();

        double dep = (100 - rate) / 100.0;

        double finalValue = ini * Math.pow(dep,time);
        System.out.println("Final value = " + finalValue);

    }
}
