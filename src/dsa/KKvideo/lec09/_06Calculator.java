package dsa.KKvideo.lec09;

import java.util.Scanner;

public class _06Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Result: " + ans); // ✅ print inside loop

            } else {
                System.out.println("Invalid operation!");
            }
        }

    }
}