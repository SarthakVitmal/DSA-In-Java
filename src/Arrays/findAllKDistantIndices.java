package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class findAllKDistantIndices {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        int key = 2, k = 2;
        ArrayList<Integer> ans = findKDistantIndices(arr,key,k);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> findKDistantIndices(int[] arr, int key, int k) {
        ArrayList<Integer> keyIdx = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)keyIdx.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            int minDist = Integer.MAX_VALUE;
            for (int j = 0; j < keyIdx.size(); j++) {
                minDist = Math.min(minDist,Math.abs(i-keyIdx.get(j)));
            }
            if(minDist <= k){
                ans.add(i);
            }
        }
        return ans;
    }
}
