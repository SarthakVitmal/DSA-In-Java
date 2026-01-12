package Arrays;

public class mirrorDistanceOfInteger {
    public static void main(String[] args) {
        int n = 25;
        int res = mirrorDistance(n);
        System.out.println("Original No : "+ n);
        System.out.println(res);
    }

    private static int mirrorDistance(int n) {
        int rev = reverse(n);
        System.out.println("Reverse : " +rev);
        return Math.abs(n - rev);
    }

    private static int reverse(int n) {
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        return sum;
    }
}
