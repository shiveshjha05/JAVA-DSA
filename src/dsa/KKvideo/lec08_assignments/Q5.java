package dsa.KKvideo.lec08_assignments;

//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number1 :- ");
        int num1 = input.nextInt();
        
        System.out.print("Input number2 :- ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal!");
        }

    }
}
