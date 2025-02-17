package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Arrays;

public class sortVowels {
    public static String sort(String s){
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Character> arr = new ArrayList<>();
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (int i = 0; i < sb.length(); i++) {
            if(vowels.contains(sb.charAt(i))){
                arr.add(sb.charAt(i));
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
        int j = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (vowels.contains(sb.charAt(i))) {
                sb.setCharAt(i,arr.get(j++));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "lEetcOde";
        String ans = sort(s);
        System.out.println(ans);
    }
}
