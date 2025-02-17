package SortingAlgorithms;

public class insertionSort {
    public static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[]arr = {7,4,1,10,13,6,3,8,5,2,9};
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i; j >= 1; j--) {
//                if(arr[j] < arr[j-1]){
//                    swap(arr,j,j-1);
//                }else break;
//            }
//        }
//        Standard Code
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j>=1 && arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                    j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
