package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair>{
    int point;
    int dist;
    Pair(int point,int dist){
        this.point = point;
        this.dist = dist;
    }
    public int compareTo(Pair p){
        if(p.dist != this.dist) return this.dist - p.dist;
        else return this.point-p.point;
    }
}
public class kthClosestElements {
    public static ArrayList<Integer> findClosest(int[] arr,int k,int x){
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int dist = Math.abs(arr[i] - x);
            pq.add(new Pair(arr[i],dist));
            if(pq.size() > k)pq.remove();
        }

        while(pq.size() > 0){
            Pair p = pq.remove();
            al.add(p.point);
        }
        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int k = 4;
        int x = -1;
        ArrayList<Integer> al = findClosest(arr,k,x);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
