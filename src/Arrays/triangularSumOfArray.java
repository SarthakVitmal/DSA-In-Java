package Arrays;

/*
You are given a 0-indexed integer array nums, where nums[i] is a digit between 0 and 9 (inclusive).

The triangular sum of nums is the value of the only element present in nums after the following process terminates:

Let nums comprise of n elements. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n - 1.
For each index i, where 0 <= i < n - 1, assign the value of newNums[i] as (nums[i] + nums[i+1]) % 10, where % denotes modulo operator.
Replace the array nums with newNums.
Repeat the entire process starting from step 1.
Return the triangular sum of nums.
 */
public class triangularSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int ans = triangularSum(arr);
        System.out.println(ans);
    }

    private static int triangularSum(int[] arr) {
        int n = arr.length;
        if(arr.length == 1)return arr[0];
        int[] temp;
        while (n > 1){
            temp = new int[n];
            for (int i = 0; i < n-1; i++) {
                temp[i] = (arr[i] + arr[i+1]) % 10;
            }
            for (int i = 0; i < temp.length; i++) {
                arr[i] = temp[i];
            }
            n--;
        }
        return arr[0];
    }
}
