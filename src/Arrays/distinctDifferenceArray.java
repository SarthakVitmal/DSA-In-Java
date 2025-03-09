package Arrays;

/*
2670. Find the Distinct Difference Array
You are given a 0-indexed array nums of length n.

The distinct difference array of nums is an array diff of length n such that diff[i] is equal to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the number of distinct elements in the prefix nums[0, ..., i].

Return the distinct difference array of nums.

Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive. Particularly, if i > j then nums[i, ..., j] denotes an empty subarray.
 */

public class distinctDifferenceArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = distinctDifferenceArr(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }

    private static int[] distinctDifferenceArr(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prefixCount = countDistinct(arr,0,i);
            int suffixCount = countDistinct(arr,i+1,arr.length-1);
            ans[i] = prefixCount - suffixCount;
        }
        return ans;
    }

    private static int countDistinct(int[] arr, int start, int end) {
        int count = 0;
        boolean isUnique = true;
        for (int i = start; i <= end; i++) {
            for (int j = start; j < i; j++) {
                if(arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)count++;
        }
        return count;
    }
}
