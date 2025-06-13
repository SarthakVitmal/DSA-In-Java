package Hashmaps;

import java.util.HashMap;

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "aaabccccdd";
        int len = longestP(s);
        System.out.println(len);
    }

    private static int longestP(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch))map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        boolean isOdd = false;
        System.out.println(map);
        int len = 0;
        for(int value : map.values()){
            len += (value / 2) * 2;
            if(value % 2 == 1){
                isOdd = true;
            }
        }
        if(isOdd) len += 1;
        return len;
    }
}
