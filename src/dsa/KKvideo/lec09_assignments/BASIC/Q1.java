package dsa.KKvideo.lec09_assignments.BASIC;

// Area Of Circle Java Program


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter the length of radius (in cm) :- ");

        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();

        double area = (Math.PI * radius * radius);
        System.out.println("Area of the given circle is :- " + area + " cm sq.");

    }
}
