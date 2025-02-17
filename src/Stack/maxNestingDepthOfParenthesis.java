package Stack;

import java.util.Stack;

public class maxNestingDepthOfParenthesis {
    public static int maxDepth(String s){
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        int counter = 0;
        int counterDepth = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                st.push((int)ch);
                counter++;
            }if(!st.isEmpty() && ch == ')' && st.peek() == '('){
                st.pop();
                counter--;
            }
            counterDepth = Math.max(counter,counterDepth);
        }
        return counterDepth;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int res = maxDepth(s);
        System.out.println(res);
    }
}
