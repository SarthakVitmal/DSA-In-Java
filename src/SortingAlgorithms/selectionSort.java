package SortingAlgorithms;

public class selectionSort {
    public static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println("Original Array : ");
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {//Finding the smallest element
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            //Swapping
            swap(arr,minIdx,i);
        }
        System.out.println("\nSorted Array : ");
        print(arr);
    }
}
