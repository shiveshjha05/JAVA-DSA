package dsa.KKvideo.lec11;

import java.util.Arrays;

public class _09VarArgs {
    public static void main(String[] args) {
//        fun();
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
//        demo();
    }



    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
