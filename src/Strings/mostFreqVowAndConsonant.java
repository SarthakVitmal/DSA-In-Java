package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class mostFreqVowAndConsonant {
    public static void main(String[] args) {
        String s = "aeiaeia";
        int ans = maxFreq(s);
        System.out.println(ans);
    }

    private static int maxFreq(String s) {
        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();
        int maxFreqVow = 0;
        int maxFreqCons = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                if(vow.containsKey(s.charAt(i))){
                    int freq = vow.get(s.charAt(i));
                    vow.put(s.charAt(i),freq+=1);
                    maxFreqVow = Math.max(maxFreqVow,freq);
                }else {
                    vow.put(s.charAt(i),1);
                    maxFreqVow = Math.max(maxFreqVow,1);
                }
            }else {
                if (cons.containsKey(s.charAt(i))) {
                    int freq = cons.get(s.charAt(i));
                    cons.put(s.charAt(i), freq += 1);
                    maxFreqCons = Math.max(maxFreqCons, freq);
                } else {
                    cons.put(s.charAt(i), 1);
                    maxFreqCons = Math.max(maxFreqCons, 1);
                }
            }
        }
        return maxFreqCons+maxFreqVow;
    }
}
