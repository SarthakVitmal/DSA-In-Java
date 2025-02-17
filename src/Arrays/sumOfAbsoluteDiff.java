package Arrays;

public class sumOfAbsoluteDiff {
    public static int[] getSumAbsoluteDiff(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int diff = 0;
            for (int j = 0; j < arr.length; j++) {
                diff += Math.abs(arr[i] - arr[j]);
            }
            ans[i] = diff;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10};
        int[] ans = getSumAbsoluteDiff(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
