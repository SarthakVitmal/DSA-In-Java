package DynamicProgramming;

public class knapsackProblem {
    public static int maxProfit(int idx, int[] wt, int[] price, int capacity,int[][] dp){
        if(idx == wt.length)return 0;
        if(dp[idx][capacity] != -1)return dp[idx][capacity];
        int skip = maxProfit(idx+1,wt,price,capacity,dp);
        if(wt[idx] > capacity) return dp[idx][capacity] = skip;
        int take = price[idx] + maxProfit(idx+1,wt,price,capacity-wt[idx],dp);
        return dp[idx][capacity] = Math.max(take,skip);
    }
    public static void main(String[] args) {
        int[] price = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int C = 8;
        int n = price.length;
        int[][] dp = new int[n][C+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(maxProfit(0,wt,price,C,dp));
    }
}
