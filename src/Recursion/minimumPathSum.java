package Recursion;

public class minimumPathSum {
    public static int minPathSum(int row,int col,int m,int n,int[][] arr,int sum){
        if(row>=m || col>=n)return Integer.MAX_VALUE;
        sum += arr[row][col];
        if(row == m-1 && col == n-1)return sum;
        int rightMove = minPathSum(row,col+1,m,n,arr,sum);
        int downMove = minPathSum(row+1,col,m,n,arr,sum);
        return Math.min(rightMove,downMove);
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int m = arr.length;
        int n = arr[0].length;
        int ans = minPathSum(0,0,m,n,arr,0);
        System.out.println(ans);
    }
}
