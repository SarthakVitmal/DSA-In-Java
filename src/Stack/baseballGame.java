package Stack;

import java.util.Stack;

public class baseballGame {
    public static int calPoints(String[] operations){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String ch = operations[i];
            if(ch.equals("C")){
                if(!st.isEmpty())st.pop();
            }
            else if(ch.equals("D")){
                if(!st.isEmpty()){
                    int num1 = st.peek();
                    int mul = 2 * num1;
                    st.push(mul);
                }
            }
            else if(ch.equals("+")){
                if(!st.isEmpty()){
                    int x = st.pop();
                    int sum = x + st.peek();
                    st.push(x);
                    st.push(sum);
                }
            }
            else{
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }
        }
        int sum = 0;
        for (int i = 0; i < st.size(); i++) sum += st.get(i);
        return sum;
    }
    public static void main(String[] args) {
        String[] operations = {"1","C"};
        int res = calPoints(operations);
        System.out.println(res);
    }
}
