package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put(arr[i],1);
        }
        for(int key : map.keySet()){
            int val = map.get(key);
            set.add(val);
        }
        System.out.println(map.size());
        System.out.println(set.size());
        if(map.size() != set.size())return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,3};
        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }
}
