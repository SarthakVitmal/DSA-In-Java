package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if(map.containsKey(remaining)){
                al.add(i);
                int idx = map.get(remaining);
                al.add(idx);
            }else{
                map.put(arr[i],i);
            }
        }
        int []res = new int[al.size()];
        int j = 0;
        for (int i = res.length-1; i >= 0; i--) {
            res[j] = al.get(i);
            System.out.print(res[j] + " ");
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {2,7,11,15};
        int target = 18;
        int[] res = twoSum(arr,target);
    }
}
