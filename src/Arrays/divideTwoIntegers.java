package Arrays;

public class divideTwoIntegers {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 10;
        int ans = divide(num1,num2);
        System.out.println(ans);
    }

    private static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Math.abs(Integer.MIN_VALUE)-1;
        }
        return dividend / divisor;
    }
}
