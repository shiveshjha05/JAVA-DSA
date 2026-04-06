package dsa.KKvideo.lec11;

import java.util.Arrays;

public class _06ChangeArray {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void change(int[] nums) {
            nums[0] = 99; // if you make change to the object via this ref variable, same object will be changed
        }
}
