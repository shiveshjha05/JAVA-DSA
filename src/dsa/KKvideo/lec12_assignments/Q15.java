package dsa.KKvideo.lec12_assignments;

// Matrix Diagonal Sum

public class Q15 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++) {
            sum = sum + mat[i][i];
            if(i != (n - i - 1)) {
                sum = sum + mat[i][n-i-1];
            }
        }
        System.out.println(sum);
    }
}
