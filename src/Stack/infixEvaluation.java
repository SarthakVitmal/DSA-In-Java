package Stack;

import java.util.Stack;

public class infixEvaluation {
    public static int priority(char x){
        if(x == '*' || x == '/')return 2;
        if(x == '+' || x == '-')return 1;
        return 0;
    }
    public static int performOperation(int val1,char op,int val2){
        if(op == '*')return val1*val2;
        if(op == '+')return val1+val2;
        if(op == '-')return val1-val2;
        if(op == '/')return val1/val2;
        return 0;
    }
    public static int evaluateInfix(String s){
        if(s.chars().allMatch(Character::isDigit)) {
            return Integer.parseInt(s);
        }
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        int i=0;

        while(i < s.length()){
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch)) {
                i++;
                continue;
            }
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                st.push(num);
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                if(op.isEmpty()){
                    op.push(ch);
                    i++;
                }
                else {
                    if(!op.isEmpty() && priority(ch) <= priority(op.peek())){
                        int val2 = st.pop();
                        int val1 = st.pop();
                        char o = op.pop();
                        int res = performOperation(val1,o,val2);
                        st.push(res);
                        op.push(ch);
                    }
                    else op.push(ch);
                    i++;
                }
            }
        }
        while(!op.isEmpty()){
            int val2 = st.pop();
            int val1 = st.pop();
            char o = op.pop();
            int res = performOperation(val1,o,val2);
            st.push(res);
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "1*2-3/4+5*6-7*8+9/10";
        int res = evaluateInfix(s);
        System.out.println(res);
    }
}
