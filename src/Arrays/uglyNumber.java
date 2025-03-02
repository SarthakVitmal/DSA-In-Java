package Arrays;

import java.util.ArrayList;

public class uglyNumber {
    public static void main(String[] args) {
        int n = 1;
        boolean ans = isUgly(n);
        System.out.println(ans);
    }

    private static boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
