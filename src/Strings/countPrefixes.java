package Strings;

public class countPrefixes {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int ans = countPre(words,s);
        System.out.println(ans);
    }

    private static int countPre(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(s.startsWith(words[i]))count++;
        }
        return count;
    }
}
