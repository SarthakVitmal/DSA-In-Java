package Arrays;

public class sumOfGoodNumbers {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,5,4};
        int k = 2;
        int ans = sumOfGoodNos(nums,k);
        System.out.println(ans);
    }

    private static int sumOfGoodNos(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean minus = checkIMinusK(i,k);
            boolean plus = checkIPlusK(i,k,arr.length);
            if(minus && plus && arr[i] > arr[i-k] && arr[i] > arr[i+k])sum+=arr[i];
            if(!minus && plus && arr[i] > arr[i+k])sum+=arr[i];
            if(minus && !plus && arr[i] > arr[i-k])sum+=arr[i];
        }
        return sum;
    }

    private static boolean checkIPlusK(int i, int k, int n) {
        return i + k < n;
    }

    private static boolean checkIMinusK(int i, int k) {
        return i - k >= 0;
    }
}
