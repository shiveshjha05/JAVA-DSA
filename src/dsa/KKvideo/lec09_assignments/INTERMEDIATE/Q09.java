package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate Batting Average

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total runs scored :- ");
        int run = sc.nextInt();
        System.out.print("Total innings played :- ");
        int inning = sc.nextInt();
        System.out.print("No. of innings in which batter was not out = ");
        int notOut = sc.nextInt();

        int out = inning - notOut;

        if (out == 0) {
            System.out.println("Avg. is undefined!");
        }
        else {
            double avg = (double) run / out;
//          System.out.println("Average = " + avg);
            System.out.printf("Average = %.2f", avg);
        }
    }
}
