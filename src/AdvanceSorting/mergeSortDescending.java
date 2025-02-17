package AdvanceSorting;

public class mergeSortDescending {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }
    public static void merge(int[] arr,int[] a,int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                arr[k++] = a[i++];
            } else if (a[i] < b[j]) {
                arr[k++] = b[j++];
            }
        }

        if(i == a.length){
            while(j<b.length)arr[k++] = b[j++];
        }
        if(j == b.length){
            while(i<a.length)arr[k++] = a[i++];
        }
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i + n/2];
        }
        if(n == 1)return;
        mergeSort(a);
        mergeSort(b);
        merge(arr,a,b);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,9,2,4,3,6,7,8};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
