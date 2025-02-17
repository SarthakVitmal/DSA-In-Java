package Recursion;

public class powerWithLogarithmic {
    public static int power(int a,int b){
        if(b==0)return 1;
        int ans = power(a,b/2);
        if(b%2==0)return ans * ans;
        else return ans * ans * a;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int res = power(a,b);
        System.out.println(res);
    }
}
