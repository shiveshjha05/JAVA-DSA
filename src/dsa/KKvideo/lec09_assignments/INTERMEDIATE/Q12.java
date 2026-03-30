package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate Average Marks

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of inputs :- ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        System.out.print("Enter the marks obtained in each subject one by one :- ");
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            int marks = sc.nextInt();
            sum = sum + marks;
        }

        double avg = (double) sum / n;
        System.out.printf(" Average = %.2f\n" , avg);

    }

}
