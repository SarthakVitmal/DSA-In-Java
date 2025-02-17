package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

class Pairs implements Comparable<Pairs> {
    int ele;
    int freq;
    Pairs(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pairs p){
        return this.freq - p.freq;
    }
}
public class topKFrequentElements {
    public static int[] topKFrequent(int[] arr,int k){
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pairs> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put(arr[i],1);
        }

        for(int ele:map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pairs(ele,freq));
            if(pq.size() > k)pq.remove();
        }
        for (int i = 0; i < k; i++) {
            Pairs p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(arr,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
