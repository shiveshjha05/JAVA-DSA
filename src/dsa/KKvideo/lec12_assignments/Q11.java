package dsa.KKvideo.lec12_assignments;

// Count Items Matching a Rule

public class Q11 {
    public static void main(String[] args) {

        String[][] items = {
                {"phone","blue","pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}
        };

        String ruleKey = "color";
        String ruleValue = "silver";

        int idx = 0;

        if (ruleKey.equals("type")) {
            idx = 0;
        } else if (ruleKey.equals("color")) {
            idx = 1;
        } else {
            idx = 2;
        }

        int count = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i][idx].equals(ruleValue)) {
                count++;
            }
        }

        System.out.println(count);
    }
}