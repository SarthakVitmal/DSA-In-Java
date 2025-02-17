package Stack;

import java.util.Stack;

public class prefixToInfix {
    public static String preToIn(String s){
        Stack<String> st = new Stack<>();
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(String.valueOf(ch));
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                String val1 = st.pop();
                String val2 = st.pop();
                String res = "("+val1+ch+val2+")";
                st.push(res);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "-9/*+5346";
        String res = preToIn(s);
        System.out.println(res);
    }
}
