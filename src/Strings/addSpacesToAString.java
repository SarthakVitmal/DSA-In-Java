package Strings;

import java.util.HashSet;

public class addSpacesToAString {
    public static void main(String[] args) {
        String s = "icodeinpython";
        int []spaces = {1,5,7,9};
        String ans = addSpace(s,spaces);
        System.out.println(ans);
    }

    private static String addSpace(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < spaces.length; i++) {
            set.add(spaces[i]);
        }
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(i)){
                sb.append(" "+s.charAt(i));
            }else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
