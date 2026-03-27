package dsa.KKvideo.lec09_assignments.BASIC;

// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {

        System.out.print("Enter the number :- ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int largest = input;

        if (input == 0){
            System.out.println("No number entered!");
        }
        else {
            while(input != 0) {
                if (input > largest) {
                    largest = input;
                }
                input = in.nextInt();
            }

            System.out.println("Largest input is = " + largest);

        }
    }
}
