package Arrays;

import java.util.Arrays;

public class arrayPartition {
    public static int arrayPairSum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i+=2) {
            int min = Math.min(arr[i],arr[i+1]);
            System.out.println(min);
            maxSum += min;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(arr));
    }
}
