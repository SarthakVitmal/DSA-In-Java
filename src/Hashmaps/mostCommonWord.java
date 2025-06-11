package Hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class mostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = {"bob","hit"};
        String ans = mostCommon(paragraph,banned);
        System.out.println(ans);
    }

    private static String mostCommon(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        String[] words = paragraph.split("\\W+");
        for (int i = 0; i < words.length; i++) {
            String str = words[i].toLowerCase();
            if(map.containsKey(str))map.put(str,map.get(str)+1);
            else map.put(str,1);
        }
        System.out.println("Hashmap"+map);
        HashSet<String> set = new HashSet<>();
        for (String word : banned) {
            set.add(word.toLowerCase());
        }
        System.out.println("Hashset"+set);
        int maxFreq = Integer.MIN_VALUE;
        for(String key : map.keySet()){
            if(!set.contains(key)){
                maxFreq = Math.max(maxFreq,map.get(key));
            }
        }
        for(String key : map.keySet()){
            int freq = map.get(key);
            if(freq == maxFreq && !set.contains(key)){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}
