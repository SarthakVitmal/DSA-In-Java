package AdvanceSorting;

public class    quickSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low]; int pivotIndex = low;
        int smallerElement = 0;
        //I will swap the pivot index with its correct position.
        for (int i = low+1; i <= high; i++) {
            if(arr[i] <= pivot)smallerElement++; //Counting no of smaller elements than pivot
        }
        int correctIndex = pivotIndex + smallerElement;
        swap(arr,pivotIndex,correctIndex); //swapping the pivot index with the correct index

        int i = low;int j = high;
        while(i<correctIndex && j>correctIndex){
            if(arr[i] <= pivot)i++;  //if pivot is greater than left side I will make i++;
            else if(arr[j] >= pivot)j--; //if pivot is smaller than right side I will make j--;
            // if arr[i] is greater than pivot on left side and arr[i] is smaller than pivot on right side I will swap both the elements
            else if(arr[i] > pivot && arr[j] <= pivot) swap(arr,i,j);
        }
        return correctIndex;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high)return;//If array is of size 1
        int index = partition(arr,low,high);
        quickSort(arr,0,index-1);
        quickSort(arr,index+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,3,2,6,5,8};
        print(arr);
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
