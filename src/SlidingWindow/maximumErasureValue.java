package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class maximumErasureValue {
    public static int maximumUniqueSubarray(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        int left = 0;

        // Use a map to track the last index of each element
        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {
            int num = arr[right];
            if (map.containsKey(num)) {
                int lastIndex = map.get(num);
                while (left <= lastIndex) {
                    currentSum -= arr[left];
                    map.remove(arr[left]);
                    left++;
                }
            }

            // Add num to the current window
            map.put(num, right);
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 6};
        int ans = maximumUniqueSubarray(arr);
        System.out.println(ans);  // Output should be 17 for this array
    }
}
