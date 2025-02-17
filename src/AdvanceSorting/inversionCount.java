package AdvanceSorting;

public class inversionCount {
    static int count;
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    public static void countInverse(int[] a,int[] b){
//        int i = 0; int j = 0;
//        while(i<a.length && j<b.length){
//            if(a[i] > b[j]){
//                count += a.length - i;
//                j++;
//            }
//            else i++;
//        }
//    }
    public static void merge(int[] a,int[] b,int[] arr){
        int n = arr.length;
        int i=0;int j=0;int k=0;
        while(i<a.length && j<b.length){
            if(a[i] > b[j]){
                count += a.length - i;
                arr[k++] = b[j++];
            }
            else if(a[i] < b[j]) arr[k++] = a[i++];
        }
        if(i == a.length){
            while(j < b.length)arr[k++] = b[j++];
        }
        if(j == b.length){
            while(i < a.length)arr[k++] = a[i++];
        }
    }
    public static void merge_sort(int[] arr){
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
        if(n==1)return;
        merge_sort(a);
        merge_sort(b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        print(arr);
        merge_sort(arr);
        print(arr);
        System.out.println(count);
    }
}
