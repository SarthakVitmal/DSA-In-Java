package Strings;

import java.util.Stack;

public class makeStringGreat {
    public static void print(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
    public static String makeGood(String s){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && Character.toLowerCase(ch) == Character.toLowerCase(st.peek()) && st.peek()!=ch) {
                st.pop();
            }else st.push((int)ch);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.size(); i++) {
            sb.append((char)(int)st.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        String res = makeGood(s);
        print(res);
    }
}
