package dsa.KKvideo.lec12_assignments;

// Cells with Odd Values in a Matrix

public class Q14 {
    public static void main(String[] args) {
        int m = 2, n = 2;
        int[][] indices = {
                {1, 1},
                {0, 0}
        };

        int[][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            // increment row
            for (int j = 0; j < n; j++) {
                matrix[r][j]++;
            }

            // increment column
            for (int k = 0; k < m; k++) {
                matrix[k][c]++;
            }

        }

        // Count odd values
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
