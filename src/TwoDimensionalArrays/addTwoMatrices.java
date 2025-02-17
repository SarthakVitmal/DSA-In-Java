package TwoDimensionalArrays;

import java.util.Scanner;

public class addTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        int [][]brr = new int[r][c];

        System.out.println("Enter the elements of first array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                brr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                brr[i][j] += arr[i][j];
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
