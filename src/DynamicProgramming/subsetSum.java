package DynamicProgramming;

import java.util.Arrays;

public class subsetSum {
    public static void main(String[] args) {
        int[] arr = {0,8,5,2,4};
        int target = 15;
        int[][] dp = new int[arr.length][target+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        boolean res = isSubsetSum(0,arr,target,dp);
        System.out.println(res);
    }

    private static boolean isSubsetSum(int idx, int[] arr, int target, int[][] dp) {
        if(target == 0)return true;
        if(idx == arr.length)return false;
        if(dp[idx][target] != -1) return (dp[idx][target] == 1);
        boolean ans;
        boolean skip = isSubsetSum(idx+1,arr,target,dp);
        if(target -arr[idx] < 0) ans = skip;
        else{
            boolean take = isSubsetSum(idx + 1, arr, target - arr[idx], dp);
            ans = take || skip;
        }
        if(ans) dp[idx][target] = 1;
        else dp[idx][target] = 0;
        return ans;
    }
}
