package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate Electricity Bill

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        System.out.print("Enter the amount of units used:- ");
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        int bill;
        if (unit < 0) {
            System.out.println("Invalid input");
        }
        else {
            if (unit <= 100) {
                bill = unit * 5;
            } else if (unit <= 200) {
                bill = 100 * 5 + (unit - 100) * 7;
            } else {
                bill = 100 * 5 + 100 * 7 + (unit - 200) * 10;
            }
            System.out.println("Total electricity bill = " + bill);
        }
    }
}
