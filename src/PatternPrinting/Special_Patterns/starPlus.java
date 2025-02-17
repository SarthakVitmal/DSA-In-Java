package PatternPrinting.Special_Patterns;

import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==(n/2)+1 || j==(n/2)+1) {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
