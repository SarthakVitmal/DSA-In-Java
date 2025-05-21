package BitManipulation;

import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power of 2 : ");
        int x = sc.nextInt();
        int ans = power(x);
        System.out.println(ans);
    }
    private static int power(int x){
        return 1<<x;
    }
}
