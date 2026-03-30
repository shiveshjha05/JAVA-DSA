package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

// Power In Java

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        double num = sc.nextDouble();
        System.out.print("Enter the power you wanna calculate :- ");
        int power = sc.nextInt();


//        double result = Math.pow(num,power);
//        System.out.println("Result = " + result); OR

        double pro = 1;

        if (num == 0 && power < 0) {
            System.out.println("Invalid input");
            return;
        }

        if (power < 0) {
            num = 1 / num;
            power = -power;
        }

        for (int i = 1; i <= power; i++) {
            pro = pro * num ;
        }
        System.out.println("Result = " + pro);

    }
}
