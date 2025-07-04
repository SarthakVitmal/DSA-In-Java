package Strings;

import java.util.HashMap;

public class decodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String ans = decodeString(key,message);
        System.out.println(ans);
    }

    private static String decodeString(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        char curr = 'a';
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if(ch != ' ' && !map.containsKey(ch)){
                map.put(ch,curr);
                curr++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if(ch != ' ')sb.append(map.get(ch));
            else sb.append(' ');
        }
        return sb.toString();
    }
}
