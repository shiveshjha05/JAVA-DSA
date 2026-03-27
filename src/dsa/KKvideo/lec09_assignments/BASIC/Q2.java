package dsa.KKvideo.lec09_assignments.BASIC;

// Area Of Triangle

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base (in cm) :- ");
        double base = in.nextDouble();
        System.out.print("Enter the height (in cm) :- ");
        double height = in.nextDouble();

        double area = (0.5 * base * height);
        System.out.println("Area of the given triangle is :- " + area + " cm sq.");

    }

}
