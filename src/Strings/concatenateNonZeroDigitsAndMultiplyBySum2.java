package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class concatenateNonZeroDigitsAndMultiplyBySum2 {
    public static void main(String[] args) {
        String s = "10203004";
        int[][] queries = {{0,7},{1,3},{4,6}};
        int[] ans = sumAndMultiply(s,queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] sumAndMultiply(String s, int[][] queries) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            int start = queries[i][0];
            int end = queries[i][1];
            for (int k = start; k <= end; k++) {
                if (s.charAt(k) != '0')
                    sb.append(s.charAt(k));
            }
            for (int j = 0; j < sb.length(); j++) {
                sum += sb.charAt(j) - '0';
            }
            if (sb.isEmpty())
                al.add(0);
            else {
                long num = Integer.parseInt(sb.toString());
                long finalVal = num * sum;
                al.add((int)finalVal);
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
