package Arrays;

public class alternatingDigitSum {
    private static int alternateDigitSum(int n){
        String s = String.valueOf(n);
        int count;
        count = (s.length() % 2 == 0) ? 1 : 0;
        int oddSum = 0, evenSum = 0;
        while (n != 0){
            int rem = n % 10;
            if(count % 2 == 1)oddSum += rem;
            else evenSum += rem;
            n /= 10;
            count++;
        }
        return evenSum - oddSum;
    }
    public static void main(String[] args) {
        int n = 521;
        int sum = alternateDigitSum(n);
        System.out.println(sum);
    }
}
