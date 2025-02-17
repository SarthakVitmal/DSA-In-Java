package Arrays;

import java.util.Objects;

public class findMaxNoStringPairs {
    public static String reverseString(String s){
        char[] ch = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = ch.length-1; i >= 0 ; i--) {
            res.append(ch[i]);
        }
        return res.toString();
    }
    public static int maxNoOfStringPairs(String[] words){
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(Objects.equals(words[i],reverseString(words[j])))count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"ab","cc"};
        int ans = maxNoOfStringPairs(words);
        System.out.println(ans);
    }
}
