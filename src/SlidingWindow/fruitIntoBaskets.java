package SlidingWindow;

import java.util.HashMap;

public class fruitIntoBaskets {
    public static int totatFruits(int[] arr){
        int i=0, j=0;
        int len, maxLen=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(j<arr.length){
            if(map.containsKey(arr[j])){
                int freq = map.get(arr[j]);
                map.put(arr[j],freq+1);
            }else map.put(arr[j],1);
            while(map.size() > 2){
                int freq = map.get(arr[i]);
                if(freq == 1)map.remove(arr[i]);
                else map.put(arr[i],freq-1);
                i++;
            }
            len = j-i+1;
            maxLen = Math.max(maxLen,len);
            j++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,4,1,4,1,2,3,2,2};
        int ans = totatFruits(arr);
        System.out.println(ans);
    }
}
