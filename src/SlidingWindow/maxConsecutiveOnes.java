package SlidingWindow;

public class maxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length; int maxLen = 0; int flips = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if(nums[j] == 0){
                flips++;
            }

            while (flips>k){
                if(nums[i] == 0){
                    flips--;
                }
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1,1};
        int k = 2;
        int ans = longestOnes(arr,k);
        System.out.println(ans);
    }
}
