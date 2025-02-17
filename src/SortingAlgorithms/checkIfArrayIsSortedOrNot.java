package SortingAlgorithms;

public class checkIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,3,8};
        boolean flag = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= arr[i+1]) {
                flag = false;
                break;
            }else flag = true;
        }
        if(flag) System.out.println("Array is sorted");
        else System.out.println("Array is unsorted");
    }
}
