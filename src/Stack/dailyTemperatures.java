package Stack;

import java.util.Stack;

public class dailyTemperatures {
    public static int[] dailyTemp(int[] temp){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] ans = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            int count = 0;
            if(st.isEmpty())st.push(temp[i]);
            else if(!st.isEmpty() && st.peek() < temp[i]){
                count++;
                ans[i-1] = count;
            }
            else if(!st.isEmpty() && st.peek() > temp[i]){
                int j = i;
                while (j < temp.length && st.peek() > temp[j]){
                    st2.push(temp[j]);
                    count++;
                    st2.pop();
                    j++;
                }
                ans[i-1] = count;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};
        int[] res = dailyTemp(temp);
    }
}
