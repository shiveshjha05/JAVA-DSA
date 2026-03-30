package dsa.KKvideo.lec09_assignments.INTERMEDIATE;

//     Calculate Distance Between Two Points
//Math.pow(x, 2) Math.sqrt(x)
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of x and y coordinates of first point :-  ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter the values of x and y coordinates of second point :-  ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

//      double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));  OR

        double distance = Math.sqrt(
                (x2 - x1) * (x2 - x1) +
                        (y2 - y1) * (y2 - y1)
        );

        System.out.println("Distance between these two points is = " + distance);

    }
}
