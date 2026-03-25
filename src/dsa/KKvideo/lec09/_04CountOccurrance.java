package dsa.KKvideo.lec09;

import java.util.Scanner;

public class _04CountOccurrance {
    public static void main(String[] args) {
        System.out.print("Enter any number :- ");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        System.out.print("Enter number whose occurrance is to count :- ");
        int number = input.nextInt();

        int count = 0;
        while (num > 0){
            long rem = num % 10;
            if(rem == number){
                count++;
            }
            num = num / 10;
        }

        System.out.println(number + " has occurred " + count + " times.");

    }
}
