package Stack;

import java.util.Stack;

public class checkValidParenthesisString {
    public static boolean checkValidString(String s){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if(st.isEmpty())st.push(ch);
            else if(ch == '(' || ch == '*')st.push(ch);
            else if(ch == ')' && st.peek() == '(' || st.peek() == '*'){
                st.pop();
            }
        }
        if(st.isEmpty())return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "(*)";
        boolean res = checkValidString(s);
        if(res) System.out.println(true);
        else System.out.println(false);
    }
}
