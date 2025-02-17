package Arrays;

import java.math.BigInteger;
import java.util.HashMap;

public class countNicePairs {
    public static int getReverse(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return sum;
    }
    public static int countPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = nums[i] - getReverse(nums[i]);
            count += map.getOrDefault(diff,0);
            System.out.println(count);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {42,11,1,97};
        int count = countPairs(nums);
        System.out.println(count);
    }
}
