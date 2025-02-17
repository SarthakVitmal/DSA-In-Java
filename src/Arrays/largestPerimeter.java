package Arrays;

import java.util.Arrays;

public class largestPerimeter {
    public static void main(String[] args) {
        int[] arr = {96,18,35,91,93,19,89,52,59,64,63,54,34,74,78,48,77,24350,92,71,52,80,28,52,29,74,16,11,15,72,61,71,4,15,18,8,60,62,18,86,4,86,52,14,89,60,95,34,76,43,24,59,60,25,4,81,69,86,61,26,74,35,100,86,81,54,79,71,4,16,23,54,46,47,1,74,59,94,97,74,6,82,87,76,94,96,3,62,46,28,52,33,51,56,14,13,27,33,9,59,69,34,75,51,31,86,72,61,57,96,77,35,52,38,84,14,88,66,77,45,60,7,89,72,45,61,9,2,79,44,24,94,92,67,72,47};
        int maxPerimeter = 0;
        boolean isTriangle = false;
        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 2; i--) {
            if(arr[i] < arr[i-1] + arr[i-2]){
                isTriangle = true;
                maxPerimeter = Math.max(maxPerimeter,arr[i] + arr[i-1] + arr[i-2]);
            }
        }
        if(isTriangle) System.out.println(maxPerimeter);
        else System.out.println(0);
    }
}
