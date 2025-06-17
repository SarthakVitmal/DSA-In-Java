package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class missingElementInAP {
    public static void main(String[] args) {
        int[] arr = {1, 6, 11, 16, 21, 31};
        int ans = missingElement(arr);
        System.out.println(ans);
    }

    private static int missingElement(int[] arr) {
        int d = (arr[arr.length-1] - arr[0]) / arr.length;
        int expectedSum = 0;
        for (int i = arr[0]; i <= arr[arr.length-1]; i+=d) {
            expectedSum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum-actualSum;
    }
}
