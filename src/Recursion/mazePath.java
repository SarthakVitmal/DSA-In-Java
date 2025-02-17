package Recursion;

import java.util.Scanner;

public class mazePath {
    public static int maze(int initialRow,int initialCol,int lastRow,int lastCol){
        if(initialRow == lastRow || initialCol == lastCol)return 1;
        int rightWays = maze(initialRow,initialCol+1,lastRow,lastCol);
        int downWays = maze(initialRow+1,initialCol,lastRow,lastCol);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();
        int res = maze(1,1,n,m);
        System.out.println(res);
    }
}
