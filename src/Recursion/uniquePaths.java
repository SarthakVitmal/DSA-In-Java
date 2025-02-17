package Recursion;

import java.util.Arrays;

public class uniquePaths {
    private static int paths(int row,int col,Integer m,Integer n,int[][] dp){
        if(row>=m || col>=n)return 0;
        if(row==m-1 && col==n-1)return 1;
        if(dp[row][col] != -1)return dp[row][col];
        int rightWays = paths(row,col+1,m,n,dp);
        int downWays = paths(row+1,col,m,n,dp);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        int m = 3, n = 7;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = paths(0,0,m,n,dp);
        System.out.println(ans);
    }
}
