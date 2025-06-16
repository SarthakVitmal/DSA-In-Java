package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class relativeRanks {
    public static String[] findRelativeRanks(int[] arr){
        String[] ans = new String[arr.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for (int i = 0; i < arr.length; i++) {
            pq.add(new int[]{arr[i],i});
        }
        int rank = 1;
        while (!pq.isEmpty()){
            int[] top = pq.poll();
            int idx = top[1];
            if(rank == 1)ans[idx] = "Gold Medal";
            else if(rank == 2)ans[idx] = "Silver Medal";
            else if(rank == 3)ans[idx] = "Bronze Medal";
            else ans[idx] = String.valueOf(rank);
            rank++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,3,8,9,4};
        String[] ans = findRelativeRanks(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
