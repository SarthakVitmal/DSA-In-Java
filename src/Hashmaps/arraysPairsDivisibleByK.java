package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class arraysPairsDivisibleByK {
    public static boolean canArrange(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int mod = arr[i] % k;
            if(map.containsKey(mod)){
                int freq = map.get(mod);
                map.put(mod,freq+1);
            }else map.put(mod,1);
        }
        if(map.containsKey(0)){
            if(map.get(0)%2!=0)return false;
            map.remove(0);
        }
        for(int key : map.keySet()){
            int rem = k - key;
            if(!map.containsKey(rem))return false;
            int keyFreq = map.get(key);
            int remFreq = map.get(rem);
            if(keyFreq!=remFreq)return false;
        }
        System.out.println(map);
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 10;
        boolean result = canArrange(arr,k);
        System.out.println(result);
    }
}
