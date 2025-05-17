package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        ArrayList<String> ans = commonChars(words);
        System.out.println(ans);
    }

    private static ArrayList<String> commonChars(String[] words) {
        ArrayList<String> al = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        String first = words[0];
        for (int i = 0; i < first.length(); i++) {
            if(map.containsKey(first.charAt(i))){
                map.put(first.charAt(i),map.get(first.charAt(i))+1);
            }else map.put(first.charAt(i),1);
        }
        HashMap<Character,Integer> minFreq;
        for (int j = 1; j < words.length; j++) {
            minFreq = new HashMap<>();
            String curr = words[j];
            ArrayList<Character> toRemove = new ArrayList<>();
            for (int i = 0; i < words[j].length(); i++) {
                if(minFreq.containsKey(curr.charAt(i))){
                    minFreq.put(curr.charAt(i),minFreq.get(curr.charAt(i))+1);
                }else minFreq.put(curr.charAt(i),1);
            }
            for (Map.Entry<Character, Integer> ele : map.entrySet()) {
                if (minFreq.containsKey(ele.getKey())) {
                    int minimumFreq = Math.min(ele.getValue(), minFreq.get(ele.getKey()));
                    map.put(ele.getKey(), minimumFreq);
                }else toRemove.add(ele.getKey());
            }
            for(Character ch : toRemove){
                map.remove(ch);
            }
        }
        for (Map.Entry<Character, Integer> ele : map.entrySet()) {
            int currFreq = ele.getValue();
            Character currKey = ele.getKey();
            for (int i = 0; i < currFreq; i++) {
                al.add(String.valueOf(currKey));
            }
        }
        return al;
    }
}
