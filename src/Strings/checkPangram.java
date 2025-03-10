package Strings;

import java.util.HashSet;

public class checkPangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    private static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : sentence.toCharArray()){
            set.add(ch);
        }
        return set.size() == 26;
    }
}
