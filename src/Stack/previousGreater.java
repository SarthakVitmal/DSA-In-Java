package Stack;

import java.util.Stack;

public class previousGreater {
    public static void main(String[] args) {
        int[] arr = {10,4,2,20,40,12,30};
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            int ch = arr[i];
            if(st.isEmpty()){
                ans[i] = -1;
                st.push(ch);
            }if(ch < st.peek()){
                ans[i] = st.peek();
                st.push(ch);
            }if(ch > st.peek()){
                while(!st.isEmpty() && ch > st.peek())st.pop();
                if(st.isEmpty())ans[i] = -1;
                else ans[i] = st.peek();
                st.push(ch);
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
}
