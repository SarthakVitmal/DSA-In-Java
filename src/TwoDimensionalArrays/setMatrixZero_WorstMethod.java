package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class setMatrixZero_WorstMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the no of cols : ");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        int [][] brr = new int[r][c];

        System.out.println("Enter the elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                brr[i][j] = arr[i][j];
            }
        }

        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                if(brr[i][j] == 0){
                    for(int a=0;a<r;a++){
                        arr[a][j] = 0;
                    }
                    for(int b=0;b<c;b++){
                        arr[i][b] = 0;
                    }
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
