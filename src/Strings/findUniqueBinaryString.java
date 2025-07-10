package Strings;

import java.util.Arrays;
import java.util.HashSet;

public class findUniqueBinaryString {
    public static void main(String[] args) {
        String[] num = {"01","10"};
        String ans = findDifferentBinaryString(num);
        System.out.println(ans);
    }

    private static String findDifferentBinaryString(String[] num) {
        int n = num[0].length();
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList(num));
        return generateBinaryStrings(n,"",set);
    }

    private static String generateBinaryStrings(int n, String s, HashSet<String> set) {
        if(n == 0)return set.contains(s) ? null : s;
        String left = generateBinaryStrings(n-1,s+"0",set);
        if(left != null)return left;
        String right = generateBinaryStrings(n-1,s+"1",set);
        if(right != null)return right;
        return null;
    }
}
