package Arrays;

import java.util.Arrays;

public class repeatedNtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3    };
        Arrays.sort(arr);
        int[] freq = new int[arr.length+1];
        int max = 0;

        for(int nums : arr)freq[nums]++;

        for (int i = 1; i <= freq.length-1; i++) {
            if(max < freq[i])max = freq[i];
        }
        System.out.println(max);
        System.out.println(arr[max]);

//        for (int i = 0; i < freq.length-1; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= freq.length-1; i++) {
//            System.out.print(freq[i] + " ");
//        }
    }
}
