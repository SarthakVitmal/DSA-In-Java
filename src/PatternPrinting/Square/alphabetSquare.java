package PatternPrinting;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        int s = sc.nextInt();
        for(int i=1;i<=s;i++){
            for(int j=1;j<=s;j++){
                System.out.print(((char)(j+64)+" "));
            }
            System.out.println();
        }
    }
}
