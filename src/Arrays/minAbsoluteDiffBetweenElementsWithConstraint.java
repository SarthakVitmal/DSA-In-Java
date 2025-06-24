package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class minAbsoluteDiffBetweenElementsWithConstraint {
    public static void main(String[] args) {
        int[] arr = {330702844,313481959,239224564,609763700,170531905};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        int x = 0;
        int ans = minAbsoluteDifference(al,x);
        System.out.println(ans);
    }
    public static int minAbsoluteDifference(ArrayList<Integer> al, int x){
        //Brute Force
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < al.size(); i++) {
        //     for (int j = i; j < al.size(); j++) {
        //         if(Math.abs(i-j) >= x){
        //             min = Math.min(min, Math.abs(al.get(i) - al.get(j)));
        //         }
        //     }
        // }
        // return min;

        //Optimized
        TreeSet<Integer> set = new TreeSet<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i = x; i < al.size(); i++) {
            set.add(al.get(i-x));
            Integer floor = set.floor(al.get(i));
            Integer ceil = set.ceiling(al.get(i));
            if (floor != null)
                minDiff = Math.min(minDiff, Math.abs(al.get(i) - floor));
            if (ceil != null)
                minDiff = Math.min(minDiff, Math.abs(al.get(i) - ceil));
        }

        return minDiff;
    }
}
