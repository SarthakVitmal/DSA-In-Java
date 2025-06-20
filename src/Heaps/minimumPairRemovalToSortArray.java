package Heaps;

import java.util.ArrayList;

public class minimumPairRemovalToSortArray {
    public static void main(String[] args) {
        int[] arr = {-1};
        int ans = minimumPairRemoval(arr);
        System.out.println(ans);
    }

    private static int minimumPairRemoval(int[] arr) {
        int n = arr.length;
        int operations = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(arr[i]);
        }
        boolean isSorted = isArrayListSorted(al);
        if(isSorted) return 0;
        else{
            while(!isArrayListSorted(al)){
                int minIdx = -1;
                int minSum = Integer.MAX_VALUE;
                for (int j = 0; j < al.size()-1; j++) {
                    int sum = al.get(j) + al.get(j+1);
                    if(sum < minSum){
                        minSum = sum;
                        minIdx = j;
                    }
                }
                int merged = al.get(minIdx) + al.get(minIdx + 1);
                al.set(minIdx,merged);
                al.remove(minIdx+1);
                operations++;
            }
        }
        return operations;
    }
    private static boolean isArrayListSorted(ArrayList<Integer> al) {
        int n = al.size();
        for (int i = 0; i < n-1; i++) {
            if(al.get(i) > al.get(i+1))return false;
        }
        if(al.get(n-1) < al.get(n-2))return false;
        return true;
    }
}
