package dsa.KKvideo.lec12_assignments;

// Running Sum of 1d Array

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int n = nums.length;
//        int[] ans = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            nums[i] = sum + nums[i];
            sum = nums[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
