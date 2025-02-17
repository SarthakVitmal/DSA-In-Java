package Stack;

import java.util.Stack;

public class prefixEvaluation {
    public static int prefixToInfix(String s){
        Stack<Integer>st = new Stack<>();
        for (int i = s.length()-1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(ch - '0');
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int val1 = st.pop();
                int val2 = st.pop();
                if(ch == '+')st.push(val1+val2);
                if(ch == '-')st.push(val1-val2);
                if(ch == '*')st.push(val1*val2);
                if(ch == '/')st.push(val1/val2);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "-9/*+5346";
        int res = prefixToInfix(s);
        System.out.println(res);
    }
}
