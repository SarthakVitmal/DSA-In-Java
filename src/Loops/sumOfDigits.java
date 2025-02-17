package Loops;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int rem;
        int sum = 0;

        while(n!=0){
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
