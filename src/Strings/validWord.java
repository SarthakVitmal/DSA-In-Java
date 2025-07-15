package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class validWord {
    public static void main(String[] args) {
        String s = "3pp";
        boolean ans = isValid(s);
        System.out.println(ans);
    }

    private static boolean isValid(String s) {
        if(s.length() < 3)return false;
        int vowelCount = 0, consonantCount = 0;
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isLetterOrDigit(s.charAt(i)))return false;
            if(set.contains(s.charAt(i)))vowelCount++;
            if(!Character.isDigit(s.charAt(i)) && !set.contains(s.charAt(i)))consonantCount++;
        }
        if(vowelCount < 1 || consonantCount < 1)return false;
        return true;
    }
}
