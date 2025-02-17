package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class removeElementAtEvenIndex {
    public static void removeEven(Queue q){
        Queue<Integer> newQueue = new LinkedList<>();
        int i=0;
        while (!q.isEmpty()){
            q.remove();
            if(!q.isEmpty()){
                newQueue.add((Integer) q.remove());
            }
        }
        System.out.println(newQueue);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        removeEven(q);
    }
}
