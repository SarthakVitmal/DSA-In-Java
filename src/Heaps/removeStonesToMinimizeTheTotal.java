package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class removeStonesToMinimizeTheTotal {
    public static void main(String[] args) {
        int[] arr = {5,4,9};
        int k = 2;
        int ans = minStoneSum(arr,k);
        System.out.println(ans);
    }

    private static int minStoneSum(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr)pq.add(ele);
        while (k != 0){
            int pop = pq.remove();
            pop = (int) Math.ceil((double) pop /2);
            pq.add(pop);
            k--;
        }
        int sum = 0;
        while (!pq.isEmpty())sum += pq.remove();
        return sum;
    }
}
