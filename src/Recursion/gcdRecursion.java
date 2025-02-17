package Recursion;

import java.util.Scanner;

public class gcdRecursion {
    public static int gcd(int num1,int num2){
        int rem = num2 % num1;
        if(rem == 0)return num1;
        return gcd(rem,num1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second No : ");
        int num2 = sc.nextInt();
        System.out.println("GCD : "+gcd(num1,num2));
    }
}
