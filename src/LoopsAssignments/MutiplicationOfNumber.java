package LoopsAssignments;

import java.util.Scanner;

public class MutiplicationOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of number : "+num);
        for(int i=num;i<=num*10;i=i+num)
            System.out.println(i);
    }
}
