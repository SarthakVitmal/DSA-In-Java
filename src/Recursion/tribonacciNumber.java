package Recursion;

public class tribonacciNumber {
    public static int tribonacci(int n) {
        if(n == 1)return 1;
        if(n <= 0)return 0;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
    public static void main(String[] args) {
        int n = 25;
        int ans = tribonacci(n);
        System.out.println(ans);
    }
}
