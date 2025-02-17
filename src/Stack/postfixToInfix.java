package Stack;

import java.util.Stack;

public class postfixToInfix {
    public static String postToIn(String s){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(String.valueOf(ch));
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                String val2 = st.pop();
                String val1 = st.pop();
                String res = "("+val1+ch+val2+")";
                st.push(res);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "953+4*6/-";
        String res = postToIn(s);
        System.out.println(res);
    }
}
