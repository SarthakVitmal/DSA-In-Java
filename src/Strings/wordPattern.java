package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

public class wordPattern {
    public static void main(String[] args) {
        String pattern = "abcdb";
        String s = "dog dog cat bat dog";
        boolean isWordPattern = wordPat(pattern,s);
        System.out.println(isWordPattern);
    }

    private static boolean wordPat(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))){
                String getValue = map.get(pattern.charAt(i));
                if(!Objects.equals(getValue, arr[i]))return false;
            }else map.put(pattern.charAt(i),arr[i]);
        }
        for (int i = 0; i < pattern.length(); i++) {
            if(reverseMap.containsKey(arr[i])){
                char getValue = reverseMap.get(arr[i]);
                if(!Objects.equals(pattern.charAt(i), getValue))return false;
            }else reverseMap.put(arr[i],pattern.charAt(i));
        }
        return true;
    }
}
