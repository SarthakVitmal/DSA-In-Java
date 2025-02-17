package SlidingWindow;

import java.util.HashMap;

public class maxLengthWithTwoOccurrence {
    public static int maximumLengthSubstring(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ele = s.charAt(i);
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }else map.put(ele,1);
        }
        System.out.println(map);
        return 0;
    }
    public static void main(String[] args) {
        String s = "bcbbbcba";
        int len = maximumLengthSubstring(s);
        System.out.println(len);
    }
}
