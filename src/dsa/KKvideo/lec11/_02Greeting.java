package dsa.KKvideo.lec11;

import java.util.Scanner;

public class _02Greeting {
    public static void main(String[] args) {
//        greeting();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name :- ");
        String nam = in.next();
        String presonalized = myGreet(nam);
        System.out.println(presonalized);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void greeting() {
        System.out.println("Hello World!");
    }
}
