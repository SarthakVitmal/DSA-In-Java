package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class finding3DigitEvenNumber {
    public static int[] findEvenNumbers(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put(arr[i],1);
        }
        for (int i = 100; i <= 999; i++) {
            int x = i;
            int c = x % 10; x /= 10;
            int b = x % 10; x /= 10;
            int a = x;
            if(map.containsKey(a)){
                int aFreq = map.get(a);
                map.put(a,aFreq-1);
                if(aFreq == 1)map.remove(a);
                if(map.containsKey(b)){
                        int bFreq = map.get(b);
                        map.put(b,bFreq-1);
                            if(bFreq == 1)map.remove(b);
                    if(map.containsKey(c)){
                        al.add(i);
                    }
                    map.put(b,bFreq);
                }
                map.put(a,aFreq);
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,8,8,2};
        int[] res = findEvenNumbers(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
