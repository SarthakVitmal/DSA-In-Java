package Recursion;

public class NthStair {
    public static int stair(int n){
        if(n==1 || n==2)return n;
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        int n = 45;
        int res = stair(n);
        System.out.println(res);
    }
}
