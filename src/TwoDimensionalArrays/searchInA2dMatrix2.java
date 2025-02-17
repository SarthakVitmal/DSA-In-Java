package TwoDimensionalArrays;

import java.util.Scanner;

public class searchInA2dMatrix2 {

    public static int searchElement(int [][]arr,int target){
        int m = arr.length;
        int n = arr[0].length;
        int i = 0;
        int j = n - 1;

        while(i<m && j>=0){
            if(arr[i][j] == target) {
                return 1;
            }
            else if(arr[i][j] > target) j--; //go left
            else i++; //go down
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the no of cols : ");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];

        System.out.println("Enter the elements of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element : ");
        int x = sc.nextInt();

        int result = searchElement(arr,x);

        if(result == 1) {
            System.out.println("Element Found");
        }else System.out.println("Not Found");


    }
}
