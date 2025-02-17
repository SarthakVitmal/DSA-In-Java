package Stack;

import java.util.Stack;

public class postfixEvaluation {
    public static int postToIn(String s){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))st.push(ch - '0');
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = st.pop();
                int v1 = st.pop();
                if(ch == '+')st.push(v1+v2);
                else if(ch == '-')st.push(v1-v2);
                else if(ch == '*')st.push(v1*v2);
                else st.push(v1/v2);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "953+4*6/-";
        int res = postToIn(s);
        System.out.println(res);
    }
}
