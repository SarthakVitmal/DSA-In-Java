package Strings;

import java.util.Stack;

public class removeStarsFromString {
    public static void main(String[] args) {
        String s = "erase*****";
        String res = removeStars(s);
        System.out.println(res);
    }

    private static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '*')st.push(s.charAt(i));
            else if(s.charAt(i) == '*'){
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
