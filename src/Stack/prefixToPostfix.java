package Stack;

import java.util.Stack;

public class prefixToPostfix {
    public static String preToPost(String s){
        Stack<String> st = new Stack<>();
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(String.valueOf(ch));
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                String val1 = st.pop();
                String val2 = st.pop();
                String res = val1+val2+ch;
                st.push(res);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "-9/*+5346";
        String res = preToPost(s);
        System.out.println(res);
    }
}
