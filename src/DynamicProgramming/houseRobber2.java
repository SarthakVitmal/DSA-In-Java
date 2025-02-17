package DynamicProgramming;

import java.util.Arrays;

public class houseRobber2 {
    public static int amount(int[] arr,int start,int end,int[] dp){
        if(start > end)return 0;
        if(dp[start] != -1)return dp[start];
        int take = arr[start] + amount(arr,start+2,end,dp);
        int skip = amount(arr,start+1,end,dp);
        return Math.max(take,skip);
    }
    public static int robLinear(int[] arr,int start,int end){
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return amount(arr,start,end,dp);
    }
    public static int rob(int[] arr){
        int n = arr.length;
        if(n == 0)return 0;
        if(n == 1)return arr[0];

        int robFromFirst = robLinear(arr,0,n-2);
        int robFromSecond = robLinear(arr,1,n-1);
        return Math.max(robFromFirst,robFromSecond);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ans = rob(arr);
        System.out.println(ans);
    }
}
