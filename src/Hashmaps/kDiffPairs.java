package Hashmaps;

import java.util.HashMap;

public class kDiffPairs {
    public static int findPairs(int[] arr,int k){
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put(arr[i],1);
        }
        for (Integer key : map.keySet()) {
            if(k>0){
                if(map.containsKey(key+k)){
                    count++;
                }
            }else if(k==0){
                int freq = map.get(key);
                if(freq > 1)count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,5,4};
        int k = 0;
        int pairs = findPairs(arr,k);
        System.out.println(pairs);
    }
}
