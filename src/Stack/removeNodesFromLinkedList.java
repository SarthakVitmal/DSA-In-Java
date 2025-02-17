package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class removeNodesFromLinkedList {
    public static int[] removeNodes(int[] arr){
        Stack<Integer>st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int ch = arr[i];
            if (st.isEmpty() || st.peek() <= ch) {
                al.add(ch);
                st.push(ch);
            }
        }

        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(al.size()-1-i);
        }
        System.out.println(st);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,4,10,7};
        int[] res = removeNodes(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
