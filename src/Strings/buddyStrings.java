package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class buddyStrings {
    public static void main(String[] args) {
        boolean isBuddy = buddyStrs("abcaa","abcbb");
        System.out.println(isBuddy);
    }

    private static boolean buddyStrs(String s, String goal) {
        if(s.length() != goal.length())return false;
        else if(s.equals(goal)){
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if(map.containsKey(s.charAt(i))){
                    int freq = map.get(s.charAt(i));
                    if(freq >= 1)return true;
                    map.put(s.charAt(i),freq+1);
                }else map.put(s.charAt(i),1);
            }
            return false;
        }else {
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != goal.charAt(i)){
                    al.add(i);
                }
            }
            if(al.size() != 2)return false;
            else {
                int i = al.get(0), j = al.get(1);
                return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
            }
        }
    }
}
