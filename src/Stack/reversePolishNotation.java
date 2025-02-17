package Stack;

import java.util.Stack;

public class reversePolishNotation {
    public static int priority(String x){
        return switch (x) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            default -> -1;
        };
    }
    public static int performOperation(int val1,String x,int val2){
        if(x.equals("+"))return val1+val2;
        if(x.equals("-"))return val1-val2;
        if(x.equals("*"))return val1*val2;
        if(x.equals("/"))return val1/val2;
        return -1;
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int val2 = st.pop();
                int val1 = st.pop();
                int res = performOperation(val1, ch, val2);
                st.push(res);
            } else {
                int num = Integer.parseInt(ch);
                st.push(num);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        int res = evalRPN(tokens);
        System.out.println(res);
    }
}
