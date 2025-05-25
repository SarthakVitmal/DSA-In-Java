package Strings;

import java.util.HashMap;

public class increasingDecreasingString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        String ans = sortString(s);
        System.out.println(ans);
    }

    private static String sortString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }else map.put(s.charAt(i),1);
        }
        while (sb.length() < s.length()){
            for (int i = 'a'; i <= 'z'; i++) {
                if(map.containsKey((char)i) && map.get((char)i) > 0){
                    int freq = map.get((char)i);
                    sb.append((char)i);
                    map.put((char)i,freq-1);
                }
            }
            for (int i = 'z'; i >= 'a'; i--) {
                if(map.containsKey((char)i) && map.get((char)i) > 0){
                    int freq = map.get((char)i);
                    sb.append((char)i);
                    map.put((char)i,freq-1);
                }
            }
        }
        return sb.toString();
    }
}
