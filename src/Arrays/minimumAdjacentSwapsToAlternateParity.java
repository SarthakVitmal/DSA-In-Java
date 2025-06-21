package Arrays;

import java.util.ArrayList;

public class minimumAdjacentSwapsToAlternateParity {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int ans = minSwaps(arr);
        System.out.println(ans);
    }

    private static int minSwaps(int[] arr) {
        int pattern1 = calculateSwaps(arr, true);
        int pattern2 = calculateSwaps(arr, false);

        if (pattern1 == -1) return pattern2;
        if (pattern2 == -1) return pattern1;
        return Math.min(pattern1, pattern2);
    }


    private static int calculateSwaps(int[] arr, boolean startEven) {
        ArrayList<Integer> evenMismatched = new ArrayList<>();
        ArrayList<Integer> oddMismatched = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean shouldBeEven = (i % 2 == 0) == startEven;
            if (shouldBeEven && arr[i] % 2 != 0) {
                evenMismatched.add(i);
            } else if (!shouldBeEven && arr[i] % 2 != 1) {
                oddMismatched.add(i);
            }
        }
        if(evenMismatched.size() != oddMismatched.size())return -1;
        int swaps = 0;
        for (int i = 0; i < evenMismatched.size(); i++) {
            swaps += Math.abs(evenMismatched.get(i) - oddMismatched.get(i));
        }
        return swaps;
    }
}
