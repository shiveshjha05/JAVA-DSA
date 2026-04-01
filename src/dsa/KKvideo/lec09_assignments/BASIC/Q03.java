package dsa.KKvideo.lec09_assignments.BASIC;

// Area Of Rectangle Program

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length (in cm) :- ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth (in cm) :- ");
        double breadth = in.nextDouble();

        double area = (length * breadth);
        System.out.println("Area of the given rectangle is :- " + area + " cm sq.");

    }

}
