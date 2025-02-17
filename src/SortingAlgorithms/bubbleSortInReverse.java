package SortingAlgorithms;

public class bubbleSortInReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,7,10,9,6};
        boolean isSorted = true;
        for (int x = 0; x < arr.length - 1; x++) {
            for (int i = 0; i < arr.length-1-x; i++) {
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
