package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueue {
    public static Queue interleaveFirstHalfWithSecondHalf(Queue<Integer>q){
        Stack<Integer> st = new Stack<>();
        int halfSize = q.size()/2;
        for (int i = 0; i < halfSize; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0;i<halfSize;i++){
            st.push(q.remove());
        }
        for (int i = 0; i < halfSize; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }
        while (!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
        Queue res = interleaveFirstHalfWithSecondHalf(q);
        System.out.println(res);
    }
}
