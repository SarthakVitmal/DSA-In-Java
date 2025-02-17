package DynamicProgramming;

//Recursion + Memoization

public class fibonacci {
    public static int findFibo(int n,int[] dp){
        if(n <= 1)return n;
        if(dp[n] != 0)return dp[n];
        int ans = findFibo(n-1,dp) + findFibo(n-2,dp);
        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        int res = findFibo(n,dp);
        System.out.println(res);
    }
}
