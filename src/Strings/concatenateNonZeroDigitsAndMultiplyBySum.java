package Strings;

public class concatenateNonZeroDigitsAndMultiplyBySum {
    public static void main(String[] args) {
        int n = 10203004;
        long ans = sumAndMultiply(n);
        System.out.println(ans);
    }

    private static long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') sb.append(s.charAt(i));
            sum += s.charAt(i) - '0';
        }
        return Long.parseLong(sb.toString()) * sum;
    }
}
