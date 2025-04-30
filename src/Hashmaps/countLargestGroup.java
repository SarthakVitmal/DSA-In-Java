package Hashmaps;

import java.util.ArrayList;
import java.util.HashSet;

public class countLargestGroup {
    public static void main(String[] args) {
        int n = 13;
        int ans = largestGroup(n);
        System.out.println(ans);
    }

    private static int largestGroup(int n) {
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
        int[] count = new int[100];

        for (int i = 0; i <= 100; i++) {
            groups.add(new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            groups.get(sum).add(i);
            count[sum]++;
        }

        int maxSize = 0;
        for (int c : count) {
            maxSize = Math.max(maxSize, c);
        }

        int result = 0;
        for (int c : count) {
            if (c == maxSize) result++;
        }

        return result;
    }
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
