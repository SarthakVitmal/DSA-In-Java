package PrefixSum;

import java.util.ArrayList;
import java.util.HashMap;

public class subarraySumEqualsK {
//    public static int subarraySum(int[] arr,int k){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if(sum == k)count++;
//            }
//        }
//        return count;
//    }
    public static int[] getPrefix(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
    public static int subarraySum(int[] arr, int k){
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        getPrefix(arr);
        for (int i = 0; i < arr.length; i++) {
            int rem = arr[i] - k;
            if(arr[i] == k)count++;
            if(map.containsKey(rem)){
                int freq = map.get(rem);
                count += freq;
            }if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);

            }else map.put(arr[i],1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,-3,0,7,8,-1};
        int k = 3;
        int ans = subarraySum(arr,k);
        System.out.println(ans);
    }
}
