//Incomplete
package PatternPrinting.Composite_Patterns;

import java.util.Scanner;

public class numberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if (i == 1 || j == 1 || i == n) {
                    System.out.print(n - 3 + " ");
                }
            }
            for(int j=1;j<=n;j++) {
                if (i == 2 || j == 2) {
                    System.out.print(n - 4 + " ");
                }
            }
            System.out.println();
        }
    }
}
