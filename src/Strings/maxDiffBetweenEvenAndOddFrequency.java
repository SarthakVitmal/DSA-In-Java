package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class maxDiffBetweenEvenAndOddFrequency {
    public static void main(String[] args) {
        String s = "mmsmsym"; //m=4 s=2 y=1
        int res = maxDifference(s);
        System.out.println(res);
    }

    private static int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else map.put(ch,1);
        }

        ArrayList<Integer> al = new ArrayList<>(map.values());
        int maxOdd = Integer.MIN_VALUE, minEven = Integer.MAX_VALUE;
        for(int ele : al){
            if(ele %  2 == 0){
                minEven = Math.min(minEven,ele);
            }else maxOdd = Math.max(maxOdd,ele);
        }
        return maxOdd - minEven;
    }
}
