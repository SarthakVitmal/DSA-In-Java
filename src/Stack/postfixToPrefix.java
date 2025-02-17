package Stack;

import java.util.Stack;

public class postfixToPrefix {
    public static String postToPre(String s){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(String.valueOf(ch));
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                String val2 = st.pop();
                String val1 = st.pop();
                String res = ch+val1+val2;
                st.push(res);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "953+4*6/-";
        String res = postToPre(s);
        System.out.println(res);
    }
}
