package Strings;

import java.util.PriorityQueue;

public class mimOperationToExceedThresholdValue {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,9};
        int k = 1;
        int ans = minOperations(nums, k);
        System.out.println(ans);
    }

    private static int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        int count = 0;
        while (pq.peek() < k){
            pq.poll();
            count++;
        }
        return count;
    }
}
