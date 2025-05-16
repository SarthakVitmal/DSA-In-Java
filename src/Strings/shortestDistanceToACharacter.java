package Strings;

import java.util.ArrayList;

public class shortestDistanceToACharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char ch = 'e';
        int[] ans = shortestToChar(s,ch);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] shortestToChar(String s, char ch) {
        int[] ans = new int[s.length()];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch)al.add(i);
        }
        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < al.size(); j++) {
                int currMin = Math.abs(al.get(j) - i);
                min = Math.min(min,currMin);
            }
            ans[i] = min;
        }
        return ans;
    }
}
