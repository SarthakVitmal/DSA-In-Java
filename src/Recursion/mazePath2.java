package Recursion;

import java.util.Scanner;

public class mazePath2 {
    public static int maze(int r,int c){
        if(r == 1 || c == 1)return 1;
        int rightWays = maze(r,c-1);
        int downWays = maze(r-1,c);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();
        int res = maze(n,m);
        System.out.println(res);
    }
}
