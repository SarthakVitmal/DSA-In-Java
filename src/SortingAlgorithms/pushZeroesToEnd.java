package SortingAlgorithms;

public class pushZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 0, 2, -40, 100, 0, 5};
        int nonZeroIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIdx];
                arr[nonZeroIdx] = temp;
                nonZeroIdx++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
