package TwoDimensionalArrays;

import java.util.Scanner;

public class setMatrixZero_BetterMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the no of cols : ");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        
        System.out.println("Enter the elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] row = new int[r];
        int[] col = new int[c];

        //marking the particular row and column
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        //Set the true rows to 0
        for (int i = 0; i < r; i++) {
            if(row[i] == 1){
                for (int j = 0; j < c; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        //Set the true cols to 0
        for (int j = 0; j < c; j++) {
            if(col[j] == 1){
                for (int i = 0; i < r; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
