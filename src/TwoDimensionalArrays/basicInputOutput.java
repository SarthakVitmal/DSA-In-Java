package TwoDimensionalArrays;

import java.util.Scanner;

public class basicInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        // For Loop
        // Input
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Output
        System.out.println("Element of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}
