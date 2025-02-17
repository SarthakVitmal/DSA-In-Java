package Stack;

import java.util.Stack;

public class validateStackSequence {
    public static boolean validateSS(int[] pushed,int[] popped){
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int ch : pushed) {
            st.push(ch);
            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        boolean result = validateSS(pushed,popped);
        System.out.println(result);
    }
}
