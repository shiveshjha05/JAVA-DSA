package dsa.KKvideo.lec12_assignments;

// Find Numbers with Even Number of Digits

public class Q16 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count = 0;
            if(number == 0) {
                count = 1;
            }
            while (number>0) {
                number = number / 10;
                count++;
            }
            if(count % 2 == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
