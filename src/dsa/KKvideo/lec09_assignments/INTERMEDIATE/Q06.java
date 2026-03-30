package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate Commission Percentage

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the total sale amount :- ");
        double sale = sc.nextDouble();
        if(sale <= 0) {
            System.out.println("Can't calculate commission percentage!");
        }

        else {
            System.out.print("Enter the commission amount :- ");
            double commission = sc.nextDouble();

            if(commission > sale || commission < 0) {
                System.out.println("Invalid input!");
            }

            else {
                double prcnt = (commission / sale ) * 100;
                System.out.println("Commission percentage = " + prcnt + "%");
            }
        }
    }
}
