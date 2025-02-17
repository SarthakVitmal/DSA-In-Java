package TwoDimensionalArrays;

import java.util.Scanner;

public class multiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the cols of first matrix : ");
        int c1 = sc.nextInt();

        System.out.println("Enter the rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the cols of second matrix : ");
        int c2 = sc.nextInt();

        int [][]arr = new int[r1][c1];
        int [][]brr = new int[r2][c2];
        int [][]crr = new int[r1][c2];

        if(c1 != r2){
            System.out.println("Multiplication not possible");
        }

        else {
            //Matrix 1
            System.out.println("Enter the elements of first matrix : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //Matrix 2
            System.out.println("Enter the elements of second matrix : ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    brr[i][j] = sc.nextInt();
                }
            }

            //Result
            System.out.println("Multiplication of matrix : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < brr.length; k++) {
                        crr[i][j] = crr[i][j] + (arr[i][k] * brr[k][j]);
                    }
                    System.out.print(crr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
