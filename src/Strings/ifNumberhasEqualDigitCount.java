package Strings;

import java.util.HashMap;

public class ifNumberhasEqualDigitCount {
    public static void main(String[] args) {
        String s = "1210";
        boolean ans = digitCount(s);
        System.out.println(ans);
    }

    private static boolean digitCount(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }else map.put(s.charAt(i),1);
        }
        for (int i = 0; i < s.length(); i++) {
            int expectedCount = Character.getNumericValue(s.charAt(i));
            int actualCount = map.getOrDefault(Character.forDigit(i, 10), 0);
            if(expectedCount!=actualCount)return false;
        }
        return true;
    }
}
