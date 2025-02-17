package Arrays;

import java.util.Arrays;

public class mostFrequentEven {
    public static int frequentEven(int[] arr){
        int[] freq = new int[arr.length];
        Arrays.sort(arr);
        for(int nums : arr){
            if(nums % 2 == 0){
                freq[nums]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < freq.length; i++) {
            if(max < freq[i]){
                max = freq[i];
                maxIdx = i;
            }
        }
        return arr[maxIdx];
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,4,4,1};
        int n = frequentEven(arr);
        System.out.println(n);
    }
}
