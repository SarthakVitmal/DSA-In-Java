package SlidingWindow;

public class minSizeSubArraySum {
    public static int minSubArrayLen(int[] arr, int target){
        int n = arr.length;
        int minlen = Integer.MAX_VALUE;
        int i=0; int j=0; int sum=0;
        while (j < n && sum < target){ //first window
            sum += arr[j++];
        }
        j--;
        // sliding window
        while (i<n && j<n){
            int len = j-i+1;
            if(sum >= target)minlen = Math.min(minlen,len);
            sum -= arr[i];
            i++;j++;
            while (j<n && sum<target){
                sum += arr[j++];
            }
            j--;
        }
        if(minlen == Integer.MAX_VALUE)return 0;
        else return minlen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int len = minSubArrayLen(arr,target);
        System.out.println(len);
    }
}
