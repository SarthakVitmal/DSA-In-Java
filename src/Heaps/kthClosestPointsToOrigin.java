package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>{
    int x;
    int y;
    int dist;
    Triplet(int dist,int x,int y){
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Triplet t){
        return this.dist - t.dist;
    }
}

public class kthClosestPointsToOrigin {
    public static int[][] findKClosest(int[][] points,int k){
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0]; int y = points[i][1];
            int dist = x*x + y*y;
            pq.add(new Triplet(dist,x,y));
            if(pq.size() > k)pq.remove();
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{3,3},{5,-1},{-2,4},{1,0},{3,2}};
        int k = 2;
        int[][] res = findKClosest(arr,k);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(
                        res[i][j] + " ");
            }
        }
    }
}
