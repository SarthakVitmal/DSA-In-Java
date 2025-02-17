package SlidingWindow;

import java.util.Arrays;

public class minimumDifferenceBetweenHighestAndLowest {
    public static int minimumDifference(int[] arr, int k) {
        if(k == 1)return 0;
        Arrays.sort(arr);
        int n = arr.length;
        int xmin = Integer.MAX_VALUE;
        for (int i = 1; i <= n-k; i++) {
            int min = arr[i];
            int max = arr[i+k-1];
            xmin = Math.min(xmin,max-min);
        }
        return xmin;
    }
    public static void main(String[] args) {
        int[] arr = {9,4,1,7}; // 1,4,7,9
        int k = 2;
        System.out.print(minimumDifference(arr,k));
    }
}
