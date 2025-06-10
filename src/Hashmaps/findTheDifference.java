package Hashmaps;

import java.util.Arrays;
import java.util.HashSet;

public class findTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char ans = findDifference(s,t);
        System.out.println(ans);
    }

    private static char findDifference(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i])return ch2[i];
        }
        return ch2[ch2.length-1];
    }
}
