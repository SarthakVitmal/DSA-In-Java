package PatternPrinting;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        int s = sc.nextInt();
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
