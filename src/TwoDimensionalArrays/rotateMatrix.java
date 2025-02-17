package TwoDimensionalArrays;

import java.util.Scanner;

public class rotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix(n*n) : ");
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        int [][]brr = new int[n][n];
        int [][]crr = new int[n][n];


        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                brr[i][j] = arr[j][i];
            }
        }

        System.out.println("Rotated Matrix by 90degree: ");
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                crr[i][j] = brr[i][j];
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
