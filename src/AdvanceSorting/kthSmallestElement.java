package AdvanceSorting;

public class kthSmallestElement {
    public static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low]; int pivotIdx = low;
        int smallerElement = 0;
        for (int i = low+1; i <= high; i++) {
            if(pivot > arr[i])smallerElement++;
        }
        int correctIdx = pivotIdx + smallerElement;
        swap(arr,pivotIdx,correctIdx);
        int i = low;int j = high;
        while(i<correctIdx && j>correctIdx){
            if(arr[i] <= arr[correctIdx])i++;
            else if(arr[j] >= arr[correctIdx])j--;
            else if(arr[i] > arr[correctIdx] && arr[j] < arr[correctIdx])swap(arr,i,j);
        }
        return correctIdx;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high)return;
        int index = partition(arr,low,high);
        quickSort(arr,0,index-1);
        quickSort(arr,index+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {5,9,1,6,8,3,2,10,7,4};
        int k = 1;
        System.out.println("Original Array : ");
        print(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("-------------------------------");
        System.out.println("Sorted Array : ");
        print(arr);
        System.out.println("-------------------------------");
        System.out.println("Kth Smallest Element : "+arr[k]);
    }
}
