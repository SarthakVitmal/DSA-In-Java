package Strings;

import java.util.HashMap;

public class firstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int nonRepeatIdx = firstUniqChar(s);
        System.out.println(nonRepeatIdx);
    }

    private static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }else map.put(s.charAt(i),1);
        }
        for (int i = 0; i < s.length(); i++) {
            int freq = map.get(s.charAt(i));
            if(freq == 1)return i;
        }
        return -1;
    }
}
