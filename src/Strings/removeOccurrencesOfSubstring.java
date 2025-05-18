package Strings;

public class removeOccurrencesOfSubstring {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        String ans = removeOccurrences(s,part);
        System.out.println(ans);
    }

    private static String removeOccurrences(String s, String part) {
        int idx;
        while ((idx = findOccurrence(s,part)) != -1){
            s = s.substring(0, idx) + s.substring(idx + part.length());
        }
        return s;
    }

    private static int findOccurrence(String s, String part) {
        return s.indexOf(part);
    }
}
