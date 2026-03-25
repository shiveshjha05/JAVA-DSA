package dsa.KKvideo.lec09;

import java.util.Scanner;

public class _02CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase.");
        }
        else {
            System.out.println("Lowercase.");
        }
    }
}
