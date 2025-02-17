package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;
class Two implements Comparable<Two>{
    int ele;
    int freq;
    Two(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Two t){
        if(this.freq == t.freq){
            return t.ele - this.ele;
        }else return this.freq - t.freq;
    }
}
public class sortByIncreasingFreq {
    public static int[] frequencySort(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else map.put(arr[i],1);
        }
        System.out.println(map);
        PriorityQueue<Two> pq = new PriorityQueue<>();
        for(int ele: map.keySet()){
            int freq = map.get(ele);
            pq.add(new Two(ele,freq));
        }

        int i = 0;
        while(pq.size() > 0){
            Two t = pq.remove();
            for (int j = 0; j < t.freq; j++) {
                ans[i++] = t.ele;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2};
        int[] ans = frequencySort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
