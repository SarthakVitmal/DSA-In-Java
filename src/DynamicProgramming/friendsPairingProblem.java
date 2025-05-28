package DynamicProgramming;

import java.util.Arrays;

public class friendsPairingProblem {
    static int[] dp;
    public static void main(String[] args) {
        int n = 4;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = pair(n,dp);
        System.out.println(ans);
    }

    private static int pair(int n, int[] dp) {
        if(n == 1 || n == 2)return n;
        if(dp[n] != -1)return dp[n];
        return dp[n] = pair(n-1, dp) + (n-1) * pair(n-2, dp);
    }
}
