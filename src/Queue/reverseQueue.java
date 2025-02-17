package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void reverseQueueUsingStack(Queue q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push((int) q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Original Queue : ");
        System.out.println(q);
        System.out.println("Reverse Queue : ");
        reverseQueueUsingStack(q);
    }
}
