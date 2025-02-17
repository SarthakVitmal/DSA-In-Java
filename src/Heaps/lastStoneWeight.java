package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {
    public static int lastStoneWt(int[] arr){
        if(arr.length == 1)return arr[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (pq.size() > 1){
            int max1 = pq.remove();
            int max2 = pq.remove();
            if(pq.isEmpty())return 0;
            if(max1!=max2)pq.add(max1-max2);
        }
        return pq.remove();
    }
    public static void main(String[] args) {
        int[] arr = {2,2};
        int res = lastStoneWt(arr);
        System.out.println(res);
    }
}
