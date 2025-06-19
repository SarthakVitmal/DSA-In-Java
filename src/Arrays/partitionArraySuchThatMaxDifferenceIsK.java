package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class partitionArraySuchThatMaxDifferenceIsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 1;
        int ans = partitionArray(arr,k);
        System.out.println(ans);
    }

    private static int partitionArray(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> subAl = new ArrayList<>();
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
            if(max - min <= k){
                subAl.add(arr[i]);
            }else{
                al.add(subAl);
                subAl.clear();
                max = arr[i];
                min = arr[i];
                subAl.add(arr[i]);
            }
        }
        al.add(subAl);
        return al.size();
    }
}
