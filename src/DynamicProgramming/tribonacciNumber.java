package DynamicProgramming;

public class tribonacciNumber {
    public static int tribonacci(int n,int[] dp) {
        if(n == 1)return 1;
        if(n <= 0)return 0;
        if(dp[n] != 0)return dp[n];
        int ans = tribonacci(n-1,dp) + tribonacci(n-2,dp) + tribonacci(n-3,dp);
        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        int ans = tribonacci(n,dp);
        System.out.println(ans);
    }
}
