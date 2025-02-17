package Stack;

import java.util.Stack;

public class infixToPrefix {
    public static int priority(String x){
        switch (x) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return -1;
        }

    }
    public static String evaluatePrefix(String s){
        Stack<String> st = new Stack<>();
        Stack<String> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(String.valueOf(ch));
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!op.isEmpty() && priority(String.valueOf(op.peek())) >= priority(String.valueOf(ch))) {
                    String v2 = st.pop();
                    String v1 = st.pop();
                    String o = String.valueOf(op.pop());
                    String res = o + v1 + v2;
                    st.push(res);
                }
                op.push(String.valueOf(ch));
            }
        }
        while (!op.isEmpty()) {
            String v2 = st.pop();
            String v1 = st.pop();
            String o = op.pop();
            String res = o + v1 + v2;
            st.push(res);
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        String res = evaluatePrefix(s);
        System.out.println(res);
    }
}
