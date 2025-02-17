package SlidingWindow;

public class longestSubarrayOfOnes {
    public static int longestSubarray(int[] arr) {
        int n = arr.length; int i = 0; int j = 0;
        int zeroes = 0; int maxLen = 0;
        int z = 0;
        for(int ele : arr){
            if(ele==0)z++;
        }
        if(z==0)return n-1; // i am removing '1'
        while (i<n && arr[i]!=1)i++; // move 'i' to first '1'
        if(i==n)return 0; // if all elements are '0'
        j = i;
        while (j<n){
            if(arr[j] == 1)j++;
            else{
                if(zeroes == 0){
                    j++;
                    zeroes++;
                }else{ //zeroes == 1
                    int len = j-i-1;
                    maxLen = Math.max(maxLen,len);
                    j++;
                    while (i<n && arr[i]!=0){
                        i++;
                    }
                    i++;
                }
            }
        }
        if(zeroes == 0)return j-i;
        int len = j-i-1;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        int ans = longestSubarray(nums);
        System.out.println(ans);
    }
}
