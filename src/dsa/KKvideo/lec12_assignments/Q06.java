package dsa.KKvideo.lec12_assignments;

// Kids With the Greatest Number of Candies

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int max = candies[0];
        int extraCandies = 3;

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        boolean[] result = new boolean[candies.length];
        for(int i = 0; i < candies.length; i++){
//            if( (candies[i] + extraCandies ) >= max) {
//                result[i] = true;
//            }
//            else {
//                result[i] = false;
//            }
        // OR
        result[i] = (candies[i] + extraCandies >= max);
        }
        System.out.println(Arrays.toString(result));
    }
}
