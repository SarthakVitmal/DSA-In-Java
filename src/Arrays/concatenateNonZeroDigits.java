package Arrays;

public class concatenateNonZeroDigits {
    public static void main(String[] args) {
        long n = 10203004;
        long ans = sumAndMultiply(n);
        System.out.println(ans);
    }

    private static long sumAndMultiply(long n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (n != 0){
            long rem = n % 10;
            if(rem != 0){
                sb.append(rem);
                sum += (int) rem;
            }
            n /= 10;
        }
        if(sb.isEmpty())return 0;
        String s = sb.reverse().toString();
        return Long.parseLong(s) * sum;
    }
}
