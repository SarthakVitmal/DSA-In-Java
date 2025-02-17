package LoopsAssignments;

import java.util.Scanner;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = sc.nextInt();
        int factors = 1;

        for (int i = 2; i < n1 && i < n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                 factors = i;
            }
        }
        System.out.print("GCD of " +n1+ " and " +n2+ " is " +factors);
    }
}
