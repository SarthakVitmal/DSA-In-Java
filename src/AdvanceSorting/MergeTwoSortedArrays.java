package AdvanceSorting;

public class MergeTwoSortedArrays {
    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] merge(int[]arr,int[]brr){
        int[] crr = new int[arr.length+brr.length];
        int i = 0;int j = 0;int k = 0;

        while(i<arr.length && j<brr.length) {
            if (arr[i] < brr[j]) crr[k++] = arr[i++];
            else if (arr[i] > brr[j]) crr[k++] = brr[j++];
        }
        if(i == arr.length){
            while(j < brr.length) crr[k++] = brr[j++];
        }else if(j == brr.length){
            while(i < arr.length) crr[k++] = arr[i++];
        }
        return crr;
    }
    public static void main(String[] args) {
        int[] arr = {10,30,50,60,80};
        int[] brr = {20,40,70,75};

        int[] crr = merge(arr,brr);
        print(crr);
    }
}
