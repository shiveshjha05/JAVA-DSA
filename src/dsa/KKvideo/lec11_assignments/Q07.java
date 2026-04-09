package dsa.KKvideo.lec11_assignments;

// Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num = sc.nextInt();
        isPrime(num);
    }

    static void isPrime(int a) {

        if (a <= 1) {
            System.out.println("Not prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("Not prime");
                return; // stop method here
            }
        }

        System.out.println("Prime");
    }
}

// OR by using boolean

//package dsa.KKvideo.lec11_assignments;
//
//import java.util.Scanner;
//
//public class Q07 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number :- ");
//        int num = sc.nextInt();
//        isPrime(num);
//    }
//
//    static void isPrime(int a) {
//        boolean isPrime = true;
//
//        for (int i = 2; i <= Math.sqrt(a); i++) {
//            if (a % i == 0) {
//                isPrime = false;
//                System.out.println("Not prime");
//                break;
//            }
//        }
//
//        if (isPrime) {
//            System.out.println("Prime");
//        }
//    }
//}