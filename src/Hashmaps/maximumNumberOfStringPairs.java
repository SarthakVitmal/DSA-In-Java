package Hashmaps;

import java.util.HashSet;

public class maximumNumberOfStringPairs {
    public static String reverse(String s){
        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
    public static int maxNoStringPairs(String[] words){
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String reverse = reverse(words[i]);
            boolean isContains = set.contains(reverse);
            if(isContains)count++;
            else set.add(words[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        String []arr = {"cd","ac","dc","zt","ca","tu"};

        int res = maxNoStringPairs(arr);
        System.out.println(res);
    }
}
