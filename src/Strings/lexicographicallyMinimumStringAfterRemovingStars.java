package Strings;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class lexicographicallyMinimumStringAfterRemovingStars {
    public static void main(String[] args) {
        String s = "aabada*d*";
        String ans = clearStars(s);
        System.out.println(ans);
    }

    private static String clearStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '*'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    int minIdx = 0;
                    for (int j = 0; j < st.size(); j++) {
                        if(st.get(j) <= st.get(minIdx))minIdx = j;
                    }
                    st.remove(minIdx);
                }
            }
        }
        while (!st.isEmpty())sb.append(st.pop());
        return sb.reverse().toString();
    }
}
