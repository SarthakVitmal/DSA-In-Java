package Heaps;

import java.util.PriorityQueue;

public class nearlySorted {
    public static int[] kSortArray(int[] arr,int k){
        int[] ans = new int[arr.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k){
                ans[j++] = pq.remove();
            }
        }
        while(pq.size() > 0){
            ans[j++] = pq.remove();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5};
        int k = 3;
        int[] res = kSortArray(arr,k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }
}
