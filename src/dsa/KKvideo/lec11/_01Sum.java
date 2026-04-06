package dsa.KKvideo.lec11;

import java.util.Scanner;

public class _01Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(5,15);
        System.out.println(ans);
    }

    // pass the value of the numbers when you are calling the method in main()

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first number :- ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number :- ");
        num2 = sc.nextInt();
        num3 = num1 + num2;
        return num3;
    }
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first number :- ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number :- ");
        num2 = sc.nextInt();
        num3 = num1 + num2;
        System.out.print("Sum = " + num3);
    }
}
