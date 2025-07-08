package Strings;

public class isSubsequence {
    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        boolean ans = isSubSeq(s,t);
        System.out.println(ans);
    }

    private static boolean isSubSeq(String s, String t) {
        if(s.isEmpty())return true;
        int i = 0;
        int j = 0;
        while (i < t.length()){
            if(j < s.length() && t.charAt(i) == s.charAt(j))j++;
            i++;
        }
        if(j == s.length())return true;
        return false;
    }
}
