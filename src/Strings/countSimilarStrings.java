package Strings;

import java.util.HashSet;

public class countSimilarStrings {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        int ans = similarPairs(words);
        System.out.println(ans);
    }

    private static int similarPairs(String[] words) {
        int count = 0;
        HashSet<Character> setA;
        HashSet<Character> setB;
        for (int i = 0; i < words.length; i++) {
            setA = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                setA.add(words[i].charAt(j));
            }
            for (int j = i+1; j < words.length; j++) {
                setB = new HashSet<>();
                for(char c : words[j].toCharArray()){
                    setB.add(c);
                }

                if(setA.equals(setB))count++;
            }
        }
        return count;
    }
}
