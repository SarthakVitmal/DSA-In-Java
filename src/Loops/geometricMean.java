package Loops;

import java.util.Scanner;

public class geometricMean {
    //1 2 4 8 16 32
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term : ");
        int a = sc.nextInt();
        System.out.println("Enter the difference : ");
        int d = sc.nextInt();
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            System.out.println(a);
            a*=d;
        }
    }
}
