package Strings;

import java.util.HashSet;

public class countConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int ans = countConsistentStr(allowed,words);
        System.out.println(ans);
    }

    private static int countConsistentStr(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            boolean isContain = true;
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if(!set.contains(ch)){
                    isContain = false;
                    break;
                }
            }
            if(isContain)count++;
        }
        return count;
    }
}
