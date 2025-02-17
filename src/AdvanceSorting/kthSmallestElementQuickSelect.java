package AdvanceSorting;
import java.util.Arrays;

public class kthSmallestElementQuickSelect {
    static int ans;
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
    public static int partition(int[]arr,int low,int high){
        int pivot = arr[low];
        int smallerElement = 0;
        for (int i = low+1; i <= high; i++) {
            if(arr[i] < pivot)smallerElement++;
        }
        int correctedIdx = low + smallerElement;
        swap(arr,correctedIdx, low);
        int i = low,j = high;
        while(i<correctedIdx && j>correctedIdx){
            if(arr[i] <= arr[correctedIdx])i++;
            else if(arr[j] >= arr[correctedIdx])j--;
            else if(arr[i] > arr[correctedIdx] && arr[j] < arr[correctedIdx])swap(arr,i,j);
        }
        return correctedIdx;
    }
    //To find the kth smallest element;
    public static void quickSelect(int[] arr,int low,int high,int k){
        if(low>high)return;
        if(low == high){
            ans = arr[low];
            return;
        }
        int index = partition(arr,low,high);
        if(index == k-1){
            ans = arr[index];
            return;
        }if(k-1 > index)quickSelect(arr,index+1,high,k);
        else quickSelect(arr,0,index-1,k);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,12,23,76,43};
        int k = 5;
        ans = 0;
        print(arr);
        quickSelect(arr,0,arr.length-1,k);
        System.out.println(k+"th Smallest Element is : "+ans);
    }
}
