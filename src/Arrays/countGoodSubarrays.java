package Arrays;

import java.util.HashMap;

//leetcode 2537 - Count the Number of Good Subarrays
public class countGoodSubarrays {
    public static void main(String[] args) {
        int[] arr = {3,1,4,3,2,2,4};
        int k = 2;
        long ans = countGood(arr,k);
        System.out.println(ans);
    }

    private static long countGood(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            int countGoodPairs = 0;
            for (int l = i; l < arr.length; l++) {
                int freq = map.getOrDefault(arr[l], 0);
                countGoodPairs += freq;
                map.put(arr[l], freq + 1);
                System.out.println("Good Pairs: "+countGoodPairs);
                if(countGoodPairs >= k)count++;
                System.out.println("Total Count: "+count);
            }
        }
        return count;
    }
}
