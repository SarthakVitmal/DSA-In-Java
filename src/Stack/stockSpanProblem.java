package Stack;

import java.util.Stack;

public class stockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {10,4,5,90,120,80};
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            int ch = arr[i];
            int count = 1;
            if(st.isEmpty()){
                st.push(ch);
                ans[i] = count;
            }if(ch < st.peek()){
                ans[i] = count;
                st.push(ch);
            }if(ch > st.peek()){
                while(!st.isEmpty() && st.peek() < ch){
                    count++;
                    temp.push(st.pop());
                }
                ans[i] = count;
                if(!temp.isEmpty()) {
                    while (!temp.isEmpty()) {
                        st.push(temp.pop());
                    }
                }
                st.push(ch);
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
