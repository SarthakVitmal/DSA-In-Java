package SlidingWindow;

import java.util.ArrayList;

//If SubArray contains all odd elements then it is nice SubArray
public class countNiceSubarrays {
    public static int numberOfSubArrays(int[] arr,int k){
        int n = arr.length;
        int count = 0; int odd = 0;
        int i = 0; int j = 0;
        for (int a = 0; a < n; a++) {
            if (arr[a] % 2 == 1) odd++;
            while (odd > k){
                if(arr[i] % 2 == 1){
                    odd++;
                }
                i++;
                j = i;
            }
            if(odd == k){
                count++;
                j++;
                while (j <= a && arr[j] % 2 == 0){
                    count++;
                    j++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        int k = 3;
        int count = numberOfSubArrays(arr,k);
        System.out.println(count);
    }
}
