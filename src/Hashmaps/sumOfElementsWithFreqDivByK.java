package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class sumOfElementsWithFreqDivByK {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,3,4};
        int ans = sumDivisibleByK(arr,2);
        System.out.println(ans);
    }

    private static int sumDivisibleByK(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else map.put(arr[i],1);
        }
        System.out.println(map.values());
        int sum = 0;
        for(Map.Entry<Integer, Integer> val : map.entrySet()){
            if(val.getValue() % k == 0){
                int key = val.getKey();
                sum += (key * val.getValue());
            }
        }
        return sum;
    }
}
