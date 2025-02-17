package TwoDimensionalArrays;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        int max = Integer.MIN_VALUE;

        System.out.println("Enter the elements of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max Element : "+max);
    }
}
