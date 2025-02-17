package Stack;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            int ch = arr[i];
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else if(st.peek() > ch) {
                ans[i] = st.peek();
            }
            else if(st.peek() < ch){
                while(!st.isEmpty() && st.peek() < ch) st.pop();
                if(st.isEmpty())ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.push(ch);
        }
    }
}
