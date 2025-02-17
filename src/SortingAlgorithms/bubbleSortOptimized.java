package SortingAlgorithms;

import java.util.Scanner;

public class bubbleSortOptimized {
    public static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int []arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        print(arr);

        boolean isSorted = true;

        for(int x=0;x<arr.length-1;x++){
            for (int i=0; i<arr.length-1-x; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted)break;
        }
        System.out.println("Sorted Array : ");
        print(arr);
    }
}
