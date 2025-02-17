package Arrays;

import java.util.Arrays;

public class singleNumber3 {
    public static int[] singleNumber(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int uniqueCount = 0;
        if(n <= 2){
            return arr;
        }
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == n - 1 || arr[i] != arr[i + 1])) {
                uniqueCount++;
            }
        }

        int i = 0;
        int k = 0;
        int[] ans = new int[uniqueCount];
        while (i < n - 1){
            int j = i + 1;
            if(arr[i] == arr[j]){
                i += 2;
            }
            else{
                ans[k++] = arr[i];
                i++;
            }

        }
        if(arr[n-1] != arr[n-2])ans[k] = arr[n-1];
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};
        int[] ans = singleNumber(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
