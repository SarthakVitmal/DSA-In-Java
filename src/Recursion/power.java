package Recursion;

public class power {
    public static int calculatePower(int a,int b){
        if(a==0 && b==0)return -1;
        if(b==0)return 1;
        return a * calculatePower(a,b-1);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int res = calculatePower(a,b);
        System.out.println(res);
    }
}
