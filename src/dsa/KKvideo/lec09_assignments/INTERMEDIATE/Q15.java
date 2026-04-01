package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Find Ncr & Npr

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r :- ");
        int r = sc.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid input!");
            return;
        }

        long fact_n = 1;
        for(int i = 1; i <= n; i++) {
            fact_n = fact_n * i;
        }
        long fact_r = 1;
        for(int i = 1; i <= r; i++) {
            fact_r = fact_r * i;
        }
        long fact_n_r = 1;
        for(int i = 1; i <= (n-r); i++) {
            fact_n_r = fact_n_r * i;
        }

        double nCr = (double) fact_n / (fact_r * fact_n_r);
        double nPr = (double) fact_n / fact_n_r;

        System.out.printf("nCr = %.0f\n", nCr);
        System.out.printf("nPr = %.0f\n", nPr);

    }
}
