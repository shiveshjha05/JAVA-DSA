package dsa.KKvideo.lec09;

import java.util.Scanner;

public class _05ReverseNum {
    public static void main(String[] args) {
        System.out.print("Enter any number :- ");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        long ans = 0;

        while (num > 0){
            long rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;
        }

        System.out.println("Reverse is :- " + ans);

    }
}
