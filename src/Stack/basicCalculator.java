package Stack;
import java.util.Stack;

public class basicCalculator {
    public static int priority(char x){
        if(x == '(')return 0;
        if(x == '+' || x == '-')return 1;
        if(x == '*' || x == '/')return 2;
        return -1;
    }
    public static int performOperation(int val1,char x,int val2){
        if(x == '+')return val1+val2;
        if(x == '-')return val1-val2;
        if(x == '*')return val1*val2;
        if(x == '/')return val1/val2;
        return -1;
    }
    public static int basicCal(String s){
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        int i=0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch)){
                i++;
            }
            else if(Character.isDigit(ch)){
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                st.push(num);
            }
            else if(ch == '('){
                op.push(ch);
                i++;
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!op.isEmpty() && priority(ch) <= priority(op.peek())){
                    int val2 = st.pop();
                    int val1 = st.pop();
                    char o = op.pop();
                    int res = performOperation(val1,o,val2);
                    st.push(res);
                }
                op.push(ch);
                i++;
            }
            else if(ch == ')'){
                while(!op.isEmpty() && op.peek()!='('){
                    int val2 = st.pop();
                    int val1 = st.pop();
                    char o = op.pop();
                    int res = performOperation(val1,o,val2);
                    st.push(res);
                }
                op.pop();
                i++;
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
        String s = "1+ 4 * (-9)";
        int res = basicCal(s);
        System.out.println(res);
    }
}
