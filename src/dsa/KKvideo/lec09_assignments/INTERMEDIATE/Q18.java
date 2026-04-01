package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Future Investment Value

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter present value :- ");
        double pv = sc.nextDouble();
        System.out.println("Enter annual interest rate (in %) :- ");
        double rate = sc.nextDouble();
        System.out.println("Number of years :- ");
        double years = sc.nextDouble();

        double FV = pv * Math.pow((1+(rate/100)),years);
        System.out.printf("Future value = %.2f\n", FV);
    }
}
