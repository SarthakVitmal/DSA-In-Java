package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class minAbsoluteDifference {
        public static ArrayList<ArrayList<Integer>> minimumAbsoluteDifference(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
                al.clear();
                al.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
            }else if(diff == minDiff) {
                al.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {40,11,26,27,-20};
        ArrayList<ArrayList<Integer>> al = minimumAbsoluteDifference(arr);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + " ");
        }
    }
}
