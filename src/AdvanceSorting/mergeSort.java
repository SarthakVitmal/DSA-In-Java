package AdvanceSorting;

public class mergeSort {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] arr){//From merge it will merge the sorted arrays
        int i = 0,j = 0,k = 0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]) arr[k++] = a[i++];
            else if(a[i] > b[j]) arr[k++] = b[j++];
        }
        if(i == a.length) while(j < b.length) arr[k++] = b[j++];
        else if(j == b.length) while(i < a.length) arr[k++] = a[i++];

    }
    public static void merge_sort(int[] arr){ //From merge_sort I will the single sorted arrays
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        if(n==1)return;//base case
        for (int i = 0; i < n/2; i++) a[i] = arr[i];
        for (int i = 0; i < n-n/2; i++) b[i] = arr[i+n/2];

        merge_sort(a);
        merge_sort(b);
        //Now I have single sorted arrays.
        //I will now merge the sorted arrays
        merge(a,b,arr);
        //To delete 'a' and 'b'
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {150,40,20,90,10,30,70,60,80,100};
        print(arr);
        merge_sort(arr);
        print(arr);
    }
}
