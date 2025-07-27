package Arrays;

import java.util.Arrays;

public class maxMedianSum {
    public static void main(String[] args) {
        int[] arr = {1,1,10,10,10,10}; // 1 1 2 2 3 3
        long ans = maximumMedianSum(arr);
        System.out.println(ans);
    }
    private static long maximumMedianSum(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        int median = 0;
        while (i < j){
            int ans = arr[j-1];
            median += ans;
            i++;
            j-=2;
        }
        return median;
    }
}
