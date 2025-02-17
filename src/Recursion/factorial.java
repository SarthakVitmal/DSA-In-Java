package Recursion;

public class factorial {
    public static int fact(int n){
        if(n==0)return 1;
        int ans = n * fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+n+" : "+fact(n));
    }
}
