package Arrays;

//leetcode 1299 - Replace Elements with Greatest Element on Right Side
public class replaceWithGreatestToItsRight {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] ans = replaceElements(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int greatest = findGreatest(arr,i+1,arr.length);
            ans[i] = greatest;
        }
        return ans;
    }

    private static int findGreatest(int[] arr, int i, int n) {
        int max = -1;
        for (int j = i; j < n; j++) {
            max = Math.max(max,arr[j]);
        }
        return max;
    }
}
