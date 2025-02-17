package Stack;
import Stack.*;

public class balancedBrackets {
    public static boolean isValid(Stack st, String str){
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')st.push(ch);
            else{
                if(st.isEmpty()) return false;
                else if(ch == ']' && st.peek()=='[' || ch == '}' && st.peek()=='{' || ch == ')' && st.peek()=='(')st.pop();
                else return false;
            }
        }
        if(st.isEmpty())return true;
        else return false;
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        String str = "{([])}";
        boolean res = isValid(st,str);
        if(res) System.out.println("Valid Parenthesis");
        else System.out.println("Invalid Parenthesis");
    }
}
