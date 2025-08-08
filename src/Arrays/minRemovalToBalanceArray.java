package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minRemovalToBalanceArray {
    public static void main(String[] args) {
        int[] arr = {1,6,2,9};
        int k = 3;
        int ans = minRemoval(arr,k);
        System.out.println(ans);
    }

    private static int minRemoval(int[] arr, int k) {
        if(arr.length <= 1)return 0;
        Arrays.sort(arr);
        int left = 0;
        int maxLen = 0;
        return 0;
    }
}
