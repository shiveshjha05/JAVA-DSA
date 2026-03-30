package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate Discount Of Product


import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price:- ");
        int ori = in.nextInt();
        System.out.print("Enter the discount% :- ");
        int dis = in.nextInt();

        double Fp;
        Fp = (double) ori * (100 - dis) / 100;
        System.out.println("Final price = " + Fp);

    }
}
