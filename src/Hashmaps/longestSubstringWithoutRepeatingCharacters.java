package Hashmaps;

import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() <= 1)return s.length();
        int i=0;
        int j=0;
        int len = 0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i){
                len = Math.max(len,j-i);
                while(s.charAt(i) != s.charAt(j))i++;
                i++;
            }else{
                map.put(s.charAt(j),j);
                j++;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);
    }
}
