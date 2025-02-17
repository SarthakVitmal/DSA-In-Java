package Recursion;

public class fibonacciSeries {
    public static int fibonacci(int n){
        if(n==0 || n==1)return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 8;
        int res = fibonacci(n);
        System.out.println(res);
    }
}
