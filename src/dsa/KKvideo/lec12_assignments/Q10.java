package dsa.KKvideo.lec12_assignments;

// Check if the Sentence Is Pangram

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        boolean[] seen = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int index = ch - 'a';   
            seen[index] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (seen[i] == false) {
                System.out.println("Not Pangram");
                return;
            }
        }

        System.out.println("Pangram");
    }
}
