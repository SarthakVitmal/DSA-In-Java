package PrefixSum;

public class productExceptSelf {
    public static int[] getPrefix(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            ans[i] = ans[i-1] * arr[i-1];
        }
        return ans;
    }
    public static int[] getSuffix(int[] arr){
        int[] ans = new int[arr.length];
        ans[ans.length-1] = 1;
        for (int i = ans.length-2; i >= 0; i--) {
            ans[i] = ans[i+1] * arr[i+1];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] prefix = getPrefix(arr);
        int[] suffix = getSuffix(arr);
        int[] ans = new int[arr.length];
        for (int i = 0; i < prefix.length; i++) {
            ans[i] = prefix[i] * suffix[i];
            System.out.print(ans[i] + " ");
        }
    }
}
