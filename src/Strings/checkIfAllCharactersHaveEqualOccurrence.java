package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class checkIfAllCharactersHaveEqualOccurrence {
    public static void main(String[] args) {
        String s = "abacbc";
        boolean ans = areOccurrencesEqual(s);
        System.out.println(ans);
    }

    private static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        ArrayList<Integer> al = new ArrayList<>(map.values());
        int freq = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            if(al.get(i) != freq)return false;
        }
        return true;
    }
}
