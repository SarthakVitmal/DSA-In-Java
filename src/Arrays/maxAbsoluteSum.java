package Arrays;

public class maxAbsoluteSum {
    public static void main(String[] args) {
        int[] arr = {2,-5,1,-4,3,-2};
        int max = maxAbsSubArray(arr);
        System.out.println(max);
    }
    private static int maxAbsSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(currentSum+arr[i],arr[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);
        currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.min(currentSum+arr[i],arr[i]);
            minSum = Math.min(currentSum,minSum);
        }
        System.out.println(minSum);
        return Math.max(maxSum,Math.abs(minSum));
    }
}
