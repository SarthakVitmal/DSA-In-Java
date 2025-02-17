package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCF {
    public static void main(String[] args) {
        //Min Heap
//      PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        /* Time Complexity
        add : O(log n)
        remove : O(log n)
        peek : O(1)

        Problem Identification
        kth Smallest/largest/closest/frequent/k-sorted array
         */

        pq.add(2);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(0);

        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
