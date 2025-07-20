package Arrays;


public class splitArrayByPrimeIndices {
    public static void main(String[] args) {
        int[] arr = {-1,5,7,0};
        long ans = splitArray(arr);
        System.out.println(ans);
    }

    private static long splitArray(int[] arr) {
        if(arr.length == 0)return 0;
        int sumPrime = 0, nonSumPrime = 0;

        for (int i = 0; i < arr.length; i++) {
            if(isPrime(i)){
                sumPrime += arr[i];
            }else nonSumPrime += arr[i];
        }
        return Math.abs(sumPrime-nonSumPrime);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
