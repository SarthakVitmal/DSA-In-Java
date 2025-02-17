package Recursion;

public class print1toN {
    public static void printN(int inc,int n){
        if(inc>n)return;
        System.out.print(inc + " ");
        printN(inc+1,n);

    }
    public static void main(String[] args) {
        int n = 10;
        int incr = 1;
        printN(incr,n);
    }
}
