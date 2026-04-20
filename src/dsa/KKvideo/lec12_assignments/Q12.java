package dsa.KKvideo.lec12_assignments;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];

            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        System.out.println(maxAltitude);
    }
}
