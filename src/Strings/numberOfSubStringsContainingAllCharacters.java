package Strings;

import java.util.HashMap;

public class numberOfSubStringsContainingAllCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        int ans = numberOfStrings(s);
        System.out.println(ans);
    }

    private static int numberOfStrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                if(map.containsKey(s.charAt(j)))map.put(s.charAt(j),map.get(s.charAt(j))+1);
                else map.put(s.charAt(j),1);

                if(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
                    count++;
                }
            }
        }
        return count;
    }
}
