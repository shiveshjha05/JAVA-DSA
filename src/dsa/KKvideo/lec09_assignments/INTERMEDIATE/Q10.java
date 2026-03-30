package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Calculate CGPA Java Program


import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects :- ");
        int n = sc.nextInt();
        System.out.print("Marks obtained in each subject :- ");

        double sum = 0;
        for(int i = 1; i <= n; i++){
            int subMarks = sc.nextInt();
            double grade = (double) subMarks / 10;
            sum = sum + grade;

        }
        double result = sum / n;
        System.out.println("CGPA = " + result);
    }
}
