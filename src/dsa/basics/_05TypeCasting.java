package dsa.basics;

import java.util.Scanner;

public class _05TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        float num = input.nextFloat();
//        System.out.println(num);

        // Type-Casting
//        int num = (int)(89.98f);
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);
//
//        byte a = 50;
//        byte b = 40;
//        byte c = 100;
//
//        int d = a * b / c;
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.12345;
        double result = (f + b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f + b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


    }
}
