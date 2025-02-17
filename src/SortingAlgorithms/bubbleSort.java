package SortingAlgorithms;

import java.util.Scanner;

public class bubbleSort {
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
        boolean flag = false;
        System.out.println("Original Array : ");
        print(arr);
//      Optimized Bubble Sort
        for(int j=0;j<arr.length - 1;j++) {
            for (int i = 0; i < arr.length-1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for (int i = 0; i < arr.length; i++) {  //Not necessary only for optimization. Checking that if array is sorted or not.
                if(arr[i] > arr[i+1]){
                    flag = false;
                    break;          // If array is found sorted the loop will get break;
                }
            }
            if(flag = true) break;
        }
        print(arr);
    }
}
