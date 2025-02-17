package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortEvenOdd {
    public static int[] sortEvenAndOdd(int[] arr){
        if(arr.length <= 2)return arr;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());

        int evenIdx = 0;
        int oddIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0)arr[i] = even.get(evenIdx++);
            else arr[i] = odd.get(oddIdx++);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};
        int[] res = sortEvenAndOdd(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
