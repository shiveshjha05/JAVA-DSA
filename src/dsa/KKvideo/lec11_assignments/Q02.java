package dsa.KKvideo.lec11_assignments;

// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num = sc.nextInt();
        numCheck(num);
    }

    static void numCheck(int a){
        if(a % 2 == 0) {
            System.out.println("Number is even.");
        }
        else {
            System.out.println("Number is odd.");
        }
    }

}
