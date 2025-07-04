package Strings;

import java.util.HashMap;

public class hashDividedString {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        String ans = stringHash(s,k);
        System.out.println(ans);
    }

    private static String stringHash(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        char curr = 'a';
        for (int i = 0; i < 26; i++) {
            map.put((char)(curr + i),i);
        }
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (j < s.length()){
            int sum = 0;
            if(j-i+1 < k)j++;
            else if(j-i+1 == k){
                for (int l = i; l <= j; l++) {
                    sum += map.get(s.charAt(l));
                }
                sb.append((char)('a' + (sum % 26)));
                i = j+1;
                j = i;
            }
        }
        return sb.toString();
    }
}
