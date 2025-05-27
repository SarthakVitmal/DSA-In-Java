package Arrays;

public class subArraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1};
        int ans = subArrSum(arr);
        System.out.println(ans);
    }

    private static int subArrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = Math.max(0,i-arr[i]);
            for (int j = start; j <= i; j++) {
                sum += arr[j];
            }
        }
        return sum;
    }
}
