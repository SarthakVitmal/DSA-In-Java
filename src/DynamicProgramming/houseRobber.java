package DynamicProgramming;

import java.util.Arrays;

public class houseRobber {
//    public static int amount(int[] arr,int i,int[] dp){
//        if(i>=arr.length)return 0;
//        if(dp[i] != -1)return dp[i];
//        int take = arr[i] + amount(arr,i+2,dp);
//        int skip = amount(arr,i+1,dp);
//        return Math.max(take,skip);
//    }
    public static int rob(int[] arr){
        int n = arr.length;
        if(n==1)return arr[0];
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr = {0,0};
        int robb = rob(arr);
        System.out.println(robb);
    }
}
