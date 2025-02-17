package TwoDimensionalArrays;

import java.util.Scanner;

public class waveForm {
    public static void display(int[][]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the no of cols : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter the elements of array : ");
        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        //Wave Print
        for(int i=0;i<r;i++){
            if(i%2!=0){
                for (int j = c-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
