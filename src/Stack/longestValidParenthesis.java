package Stack;

import java.util.Stack;

public class longestValidParenthesis {
    public static int longestValid(String s){
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(st.isEmpty() || ch == '(')st.push((int)ch);
            else {
                if (ch == '(') {
                    st.peek();
                }
                if(ch == ')' && st.peek() == '('){
                    st.pop();
                    count += 2;
                }
                if (ch == '(') {
                    st.peek();
                }
                if(ch == ')' && st.peek() == ')'){
                    count = 0;
                    st.pop();
                }
            }
        }
        System.out.println(st);
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        String s = ")()())())";
        int n = longestValid(s);
    }
}
