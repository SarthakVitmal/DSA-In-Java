package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKElements {
    public static Queue<Integer> reverseFirstKEle(Queue q,int k){
        Queue<Integer> ans = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++){
            st.push((Integer) q.poll());
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        while (!q.isEmpty()){
            ans.add((Integer) q.poll());
        }
        return ans;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> res = reverseFirstKEle(q,4);
        while (!res.isEmpty()){
            System.out.print(res.poll() + " ");
        }
    }
}
