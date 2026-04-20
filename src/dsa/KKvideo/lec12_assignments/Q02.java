package dsa.KKvideo.lec12_assignments;

// Concatenation of Array

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int n = nums.length;
        int[] ans = new int[2*n];


        for (int i = 0; i < n; i++) {
           ans[i] = nums[i];
           ans[i + n] = nums[i];
        }

        System.out.println(Arrays.toString(ans));

        // OR

//        // First loop → fill first half normally
//        for (int i = 0; i < n; i++) {
//            ans[i] = nums[i];
//        }
//
//        // Second loop → use index
//        int index = n;
//        for (int i = 0; i < n; i++) {
//            ans[index] = nums[i];
//            index++;
//        }
//
//        System.out.println(Arrays.toString(ans));
    }
}
