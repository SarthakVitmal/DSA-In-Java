package Arrays;

import java.util.Arrays;

public class sumOfUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int[] freqArray = new int[arr.length];
        int sum = 0;
        Arrays.sort(arr);
        if(arr[0] != arr[1]) freqArray[0] = 1;
        for (int i = 1; i < arr.length-1; i++) if(arr[i-1] != arr[i] && arr[i] != arr[i+1])freqArray[i] = 1;
        if(arr[arr.length-1] != arr[arr.length-2])freqArray[arr.length-1] = 1;
        for (int i = 0; i < arr.length; i++) {
            if(freqArray[i] == 1) sum+= arr[i];
        }
        System.out.println(sum);
    }
}
