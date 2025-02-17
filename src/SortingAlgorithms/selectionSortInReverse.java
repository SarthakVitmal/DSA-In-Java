package SortingAlgorithms;

public class selectionSortInReverse {
    public static void main(String[] args) {
        int[] arr = {8,1,3,5,6,2};

        for (int i = 0; i < arr.length-1; i++) {
            int maxIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
