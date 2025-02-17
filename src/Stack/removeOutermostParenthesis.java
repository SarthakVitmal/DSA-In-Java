package Stack;

import java.util.Stack;

public class removeOutermostParenthesis {
    public static String removeOuterParenthesis(String s){
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push((int)ch);
            }
            if(ch == ')'){
                st.pop();
                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "(())";
        String res = removeOuterParenthesis(s);
        System.out.println(res);
    }
}
