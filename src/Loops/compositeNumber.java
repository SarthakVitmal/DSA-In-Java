package Loops;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 2; i < n; i++) {
           if(n%i==0) {
               System.out.println("Composite Number");
               break;
           }

           else {
               System.out.println("Not a composite number");
               break;
           }
        }

    }
}
