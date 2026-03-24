package dsa.KKvideo.lec08_assignments;

// Input currency in rupees and output in USD.


import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.print("Enter the amount in INR :- ");
        Scanner input = new Scanner(System.in);
        double rs = input.nextDouble();
        double usd = rs * 0.011;

        System.out.print("Amount in USD is :- " + usd);
    }

}

