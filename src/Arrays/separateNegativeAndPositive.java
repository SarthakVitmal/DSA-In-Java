package Arrays;

public class separateNegativeAndPositive {

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 8, 1, -5, 6, -3, 9, -11};
        int left_ptr = 0;
        int right_ptr = arr.length - 1;

        while (left_ptr <= right_ptr) {
            if (arr[left_ptr] < 0) {
                left_ptr++;
            } else if (arr[right_ptr] >= 0) {
                right_ptr--;
            } else {
                swap(arr, left_ptr, right_ptr);
                left_ptr++;
                right_ptr--;
            }
        }

        for (int ele : arr) {
            System.out.printf(ele + " ");
        }
    }
}
