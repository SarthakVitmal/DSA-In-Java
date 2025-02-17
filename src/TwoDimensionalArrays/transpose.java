package TwoDimensionalArrays;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        int [][]brr = new int[c][r];

        System.out.println("Enter the elements of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //column wise printing
        System.out.println("Transpose : ");
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        try {
            //store in another matrix
            System.out.println("Transpose : ");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    brr[i][j] = arr[j][i];
                    System.out.print(brr[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("Some error occur");
        }

    }
}
