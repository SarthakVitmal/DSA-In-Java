package SlidingWindow;

public class maxSumOfSubarrays {
    public static int maximumSubarraySum(int[] arr, int k){
        int n = arr.length;
        int sum=0; int maxSum=0;
        int i=0; int j=k-1;
        for (int a = i; a <= j; a++) {
            sum += arr[a];
        }
        if(n == k)return sum;
        i++; j++;
        while (j<n){
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(sum,maxSum);
            i++; j++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int k = 3;
        int maxSum = maximumSubarraySum(arr,k);
        System.out.println(maxSum);
    }
}
