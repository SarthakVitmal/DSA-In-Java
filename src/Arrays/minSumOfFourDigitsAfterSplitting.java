package Arrays;

import java.util.Arrays;

public class minSumOfFourDigitsAfterSplitting {
    public static void main(String[] args) {
        int num = 2932;
        int ans = minimumSum(num);
        System.out.println(ans);
    }

    private static int minimumSum(int num) {
        String s = String.valueOf(num);
        String[] ans = new String[4];
        for (int i = 0; i < s.length(); i++) {
            ans[i] = String.valueOf(s.charAt(i));
            System.out.print(ans[i] + " ");
        }
        Arrays.sort(ans);
        String s1 = ans[0] + ans[2];
        String s2 = ans[1] + ans[3];
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}
