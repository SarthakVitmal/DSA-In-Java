package Arrays;

public class maxCandiesAllocatedToChildren {
    public static void main(String[] args) {
        int[] arr = {5,8,6};
        int k = 3;
        int ans = maximumCandies(arr,k);
        System.out.println(ans);
    }

    private static int maximumCandies(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int candies : arr)max = Math.max(max,candies);
        int low = 1; int high = max;
        while (low < high){
            int mid = low + (high - low) / 2;
            int sum = 0;
            for(int candies : arr){
                sum += candies / mid;
            }
            if(sum >= k)low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
