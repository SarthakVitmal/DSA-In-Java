package Hashmaps;

import java.util.HashMap;

public class badPairs {
    public static long countBadPairs(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int badPairs = 0;
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] - i;
            totalPairs += i;

            if (map.containsKey(num)) {
                int freq = map.get(num);
                badPairs += freq;
            }

            map.put(num,map.getOrDefault(num,0)+1);
        }
        return totalPairs - badPairs;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,3,3};
        long ans = countBadPairs(arr);
        System.out.println(ans);
    }
}
