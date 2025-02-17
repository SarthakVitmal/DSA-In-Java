package Heaps;

import java.util.PriorityQueue;

public class kthLargestElement {
    public static int kSmallest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(k < pq.size()){
                pq.remove();
            }
        }
        System.out.println(pq);
        return pq.peek();
    }
    public static void main(String[] args) {
        int []arr = {4,7,3,9,8,1,2,6,5};
        int k = 3;
        int res = kSmallest(arr,k);
        System.out.println(res);
    }
}
