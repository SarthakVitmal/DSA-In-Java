package SlidingWindow;

import java.util.*;

public class maxSumOfDistinctSubarrays {
    public static long maximumSubarraySum(int[] arr,int k){
        int currentSum = 0; long maxSum = 0;
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            int ele = arr[j];
            currentSum += ele;
            map.put(ele, map.getOrDefault(ele,0)+1);

            if(j-i+1 > k){
                int num = arr[i];
                currentSum -= num;
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
                i++;
            }

            if (j-i+1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9}; // 1,5,4,2,9
        int k = 3;
        long ans = maximumSubarraySum(arr,k);
        System.out.println(ans);
    }
}
