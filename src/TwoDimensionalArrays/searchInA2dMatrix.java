package TwoDimensionalArrays;

import java.util.Scanner;

public class searchInA2dMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix : ");
        int r = sc.nextInt();
        System.out.println("Enter the cols of matrix : ");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        boolean flag = false;

        System.out.println("Enter the elements of  matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target value : ");
        int x = sc.nextInt();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(x == arr[i][j]) flag = true;
            }
        }
        if(!flag) System.out.println("Not Found");
        else System.out.println("Found");

    }
}
