package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class uniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        int ans = uniqueMorseRepresentations(words);
        System.out.println(ans);
    }

    private static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            map.put((char) ('a'+i), morse[i]);
        }
        ArrayList<StringBuilder> al = new ArrayList<>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                String s = map.get(word.charAt(i));
                sb.append(s);
            }
            al.add(sb);
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < al.size(); i++) {
            set.add(String.valueOf(al.get(i)));
        }
        return set.size();
    }
}
