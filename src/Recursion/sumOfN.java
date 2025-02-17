package Recursion;

public class sumOfN {
    public static int printSum(int n){
        if(n==0)return 0; //base condition
        return n + printSum(n-1); //work
    }
    public static void main(String[] args) {
        int n = 7;
        int res = printSum(n);
        System.out.println(res);
    }
}
