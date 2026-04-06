package dsa.KKvideo.lec11_assignments;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number :- ");
        int a = sc.nextInt();
        System.out.print("Input second number :- ");
        int b = sc.nextInt();
        System.out.print("Input third number :- ");
        int c = sc.nextInt();

        maxMethod(a, b, c);
        minMethod(a, b, c);
    }

    static void maxMethod(int a, int b, int c) {
//        int tempMax;
//        if (a > b) {
//            tempMax = a;
//        } else {
//            tempMax = b;
//        }
//        if (tempMax < c) {
//            tempMax = c;
//        }
//        System.out.println("Maximum = " + tempMax);  OR We can write our logic as :-
        if(a >= b && a >= c) {
            System.out.println("Maximum = " + a);
        }
        else if(b >= a && b >= c) {
            System.out.println("Maximum = " + b);
        }
        else {
            System.out.println("Maximum = " + c);
        }
    }

    static void minMethod(int a, int b, int c) {
        int tempMin;
        if (a < b) {
            tempMin = a;
        } else {
            tempMin = b;
        }
        if (c < tempMin) {
            tempMin = c;
        }
        System.out.println("Minimum = " + tempMin);
    }
}
