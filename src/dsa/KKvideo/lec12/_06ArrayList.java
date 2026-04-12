package dsa.KKvideo.lec12;

import java.util.ArrayList;
import java.util.Scanner;

public class _06ArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(90);
//        list.add(904);
//        list.add(56);
//        list.add(120);
//        list.add(50);
//        list.add(590);
//        list.add(906);
//        list.add(880);
//        list.add(50);
//        list.add(60);
//        list.add(40);
//        list.add(30);
//
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(3);
//        System.out.println(list);

        // Taking Input

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item at any particular index

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // pass index here
        }

//        System.out.println(list);
    }
}
