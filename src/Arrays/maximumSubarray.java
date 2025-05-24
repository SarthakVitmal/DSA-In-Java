package Arrays;

public class maximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(arr);
        System.out.println(max);
    }

    private static int maxSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(currentSum+arr[i],arr[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
