package dsa.KKvideo.lec08_assignments;

// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.print("Input the string :- ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i); // build reverse
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
