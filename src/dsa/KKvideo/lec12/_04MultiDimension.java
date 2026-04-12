package dsa.KKvideo.lec12;

import java.util.Arrays;
import java.util.Scanner;

public class _04MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        Scanner sc = new Scanner(System.in);

//        int[][] arr = new int[3][]; // adding no of columns is not necessary since size of an array can vary

//        int[][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9}, // 2nd index
//        };

        int[][] arr = new int[3][3];
//        System.out.print(arr.length); // it shows no. of rows

        // input
        for(int row = 0; row < arr.length; row++) {
            // for each column of every row
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output

//        for(int row = 0; row < arr.length; row++) {
//            // for each column of every row
//            for(int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // OR

//        for(int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // enhanced for loop

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

//        // 👉 Jagged array (only rows defined)
//        int[][] arr = new int[3][];
//
//        // 👉 Step 1: define columns for each row
//        for (int row = 0; row < arr.length; row++) {
//            System.out.print("Enter number of columns for row " + row + ": ");
//            int cols = sc.nextInt();
//            arr[row] = new int[cols];
//        }
//
//        // 👉 Step 2: input values
//        for(int row = 0; row < arr.length; row++) {
//            System.out.println("Enter elements for row " + row + ":");
//            for(int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }
//
//        // 👉 output (same as your enhanced loop)
//        for (int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }

    }
}
