package dsa.KKvideo.lec12_assignments;

// Richest Customer Wealth

public class Q04 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {4,5,6}
        };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {          // rows
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {   // columns
                sum = sum + accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
