package Arrays;

import java.util.HashMap;

public class findTheLeastFrequentDigit {
    public static void main(String[] args) {
        int n = 1553322;
        int ans = getLeastFrequentDigit(n);
        System.out.println(ans);
    }

    private static int getLeastFrequentDigit(int n) {
        String s = String.valueOf(n);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else map.put(s.charAt(i),1);
        }
        int minFreq = Integer.MAX_VALUE;
        for(int val : map.values()){
            minFreq = Math.min(minFreq,val);
        }
        for(char ch : map.keySet()){
            int key = map.get(ch);
            if(key == minFreq)return Integer.parseInt(String.valueOf(ch));
        }
        return 0;
    }
}
