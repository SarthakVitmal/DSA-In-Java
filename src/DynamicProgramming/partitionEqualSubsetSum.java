package DynamicProgramming;

public class partitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        boolean ans = checkPartition(arr);
        System.out.println(ans);
    }
    private static boolean checkPartition(int[] arr) {
        int sum = 0;
        for(int ele : arr)sum += ele;
        if(sum % 2 != 0)return false;
        Boolean[][] dp = new Boolean[arr.length][(sum/2)+1];
        boolean ans = canPartition(0,arr,0,sum,dp);
        if(ans)return true;
        return false;
    }

    private static boolean canPartition(int idx, int[] arr, int currSum, int sum, Boolean[][] dp) {
        if(idx == arr.length || currSum > sum/2)return false;
        if(currSum == sum/2)return true;
        if(dp[idx][currSum] != null)return dp[idx][currSum];
        boolean skip = canPartition(idx+1,arr,currSum,sum,dp);
        boolean take = canPartition(idx+1,arr,currSum+arr[idx],sum,dp);
        return dp[idx][currSum] = skip || take;
    }
}
