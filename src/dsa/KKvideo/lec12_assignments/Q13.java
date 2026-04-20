package dsa.KKvideo.lec12_assignments;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {

        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] result = flipAndInvertImage(image);

        // print result
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
        // OR

        System.out.println(Arrays.deepToString(result));
    }

    static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;

            while (left <= right) {
                int temp = image[i][left];
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp ^ 1;

                left++;
                right--;
            }
        }

        return image;
    }
}