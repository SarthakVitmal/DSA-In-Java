package Arrays;

import java.util.Arrays;

public class singleNumber2 {
    public static int singleNumber(int[] arr){
        int n = arr.length;
        if(n <= 3)return arr[0];
        Arrays.sort(arr);
        int i = 0;
        while (i < n-1){
            int j = i + 1;
            if(arr[i] == arr[j]){
                i += 3;
            }
            else return arr[i];
        }
        if(arr[n-1] != arr[n-2])return arr[n-1];
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,56,1,1,1};
        int n = singleNumber(arr);
        System.out.println(n);
    }
}
