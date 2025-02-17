package PrefixSum;

import java.util.Arrays;

public class longestSubsequenceWithLimitedSum {
    public static int[] getPrefix(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
    public static int[] getLongestSubsequence(int[] arr,int[] queries){
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int low = 0; int high = arr.length-1;
            while (low<=high){
                int mid = (low + high) / 2;
                if(arr[mid] > queries[i])high = mid - 1;
                else{
                    ans[i] = Math.max(ans[i],mid+1);
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int[] queries = {1};
        Arrays.sort(arr);
        arr = getPrefix(arr);
        int[] ans = getLongestSubsequence(arr,queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
