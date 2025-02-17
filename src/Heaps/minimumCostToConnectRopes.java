package Heaps;

import java.util.PriorityQueue;

public class minimumCostToConnectRopes {
    public static long minCost(int[] arr){
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add((long) arr[i]);
        }
        long cost = 0;
        while(pq.size() > 1){
            long min1 = pq.remove();
            long min2 = pq.remove();
            long sum = min1 + min2;
            pq.add(sum);
            cost += sum;
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,2,6,9};
        long res = minCost(arr);
        System.out.println(res);
    }
}
