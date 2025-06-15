package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class countSpecialTriplets {
    public static void main(String[] args) {
        int[] arr = {6,3,6};
        int count = specialTriplets(arr);
        System.out.println(count);
    }

    private static int specialTriplets(int[] arr) {
        if (arr.length < 3) return 0;
        int MOD = 1000000007;
        HashMap<Long, Integer> prefixMap = new HashMap();
        HashMap<Long, Integer> suffixMap = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            long num = arr[i];
            suffixMap.put(num, suffixMap.getOrDefault(num, 0) + 1);
        }
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            long ele = arr[i];
            suffixMap.put(ele,suffixMap.get(ele)-1);
            if (suffixMap.get(ele) == 0) {
                suffixMap.remove(ele);
            }
            long target = ele * 2;
            int freq1 = prefixMap.getOrDefault(target, 0);
            int freq2 = suffixMap.getOrDefault(target,0);
            count = (count + (long) freq1 * freq2) % MOD;
            prefixMap.put(ele,prefixMap.getOrDefault(ele,0)+1);
        }
        return (int) count;
    }
}
