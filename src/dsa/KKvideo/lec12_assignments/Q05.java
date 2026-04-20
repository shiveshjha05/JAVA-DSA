package dsa.KKvideo.lec12_assignments;

// Shuffle the Array

import java.util.Arrays;

public class Q05 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] ans = new int[nums.length];

        int n = nums.length / 2;

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i]; // i = 0 par ans[0] aurrr ans[1] dono print karna hai.
            ans[ (2 * i) + 1 ] = nums[i + n];
        }
        System.out.println(Arrays.toString(ans));
    }
}
