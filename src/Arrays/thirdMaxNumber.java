package Arrays;

import java.util.Arrays;

public class thirdMaxNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > firstMax)firstMax = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != firstMax && arr[i] > secondMax)secondMax = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != firstMax && arr[i]!=secondMax && arr[i] > thirdMax)thirdMax = arr[i];
        }
        if(arr.length <= 2){
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
        System.out.println(thirdMax);

    }
}
