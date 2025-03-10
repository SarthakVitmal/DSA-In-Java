package Strings;

import java.util.HashSet;

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.
 */
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
