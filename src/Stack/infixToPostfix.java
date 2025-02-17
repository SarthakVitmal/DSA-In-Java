package Stack;

import java.util.Stack;

public class infixToPostfix {
    public static int priority(String x){
        switch (x){
            case "(":
            case ")":
                return 0;
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return -1;
    }
    public static String infixToPostfix(String s){
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(String.valueOf(ch));
            if(ch == '(')op.push((ch));
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                if(op.isEmpty())op.push((ch));
                else{
                    while (!op.isEmpty() && priority(String.valueOf(op.peek())) >= priority(String.valueOf(ch))) {
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();
                        String res = v1 + v2 + o;
                        st.push(res);
                    }
                    op.push((ch));
                }
            }
            else if(ch == ')'){
                while (!op.isEmpty() && op.peek() != '(') {
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String res = v1 + v2 + o;
                    st.push(res);
                }
                op.pop();
            }
        }
        while (!op.isEmpty()){
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();
            String res = v1 + v2 + o;
            st.push(res);
        }
        System.out.println(st);
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        String res = infixToPostfix(s);
        System.out.println(res);
    }
}
