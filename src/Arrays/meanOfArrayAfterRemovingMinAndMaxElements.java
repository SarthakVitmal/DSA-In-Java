package Arrays;

import java.util.Arrays;

public class meanOfArrayAfterRemovingMinAndMaxElements {
    public static void main(String[] args) {
        int[] arr = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};
        Arrays.sort(arr);
        double remove_count = arr.length * 0.05;
        double sum = 0;
        double count = 0;
        System.out.println(remove_count);
        for (int i = (int)remove_count; i < arr.length-remove_count; i++) {
            sum+= arr[i];
            count++;
        }
        double mean = sum/count;
        System.out.println(mean);
    }
}
