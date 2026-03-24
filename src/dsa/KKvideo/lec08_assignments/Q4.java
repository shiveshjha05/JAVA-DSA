package dsa.KKvideo.lec08_assignments;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Input two numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = input.next().charAt(0);

        int result = 0;

        if (ch == '+') {
            result = num1 + num2;
        } else if (ch == '-') {
            result = num1 - num2;
        } else if (ch == '*') {
            result = num1 * num2;
        } else if (ch == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero!");
                return;
            }
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result is: " + result);

    }
}
