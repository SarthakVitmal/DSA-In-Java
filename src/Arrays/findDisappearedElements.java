package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class findDisappearedElements {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> arr = new ArrayList<>();

        boolean[] present = new boolean[nums.length + 1];
        for (int num : nums) {
            if (num <= nums.length) {
                present[num] = true;
            }
        }
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) {
                arr.add(i);
            }
        }
        for (int missing : arr) {
            System.out.print(missing + " ");
        }
    }
}
