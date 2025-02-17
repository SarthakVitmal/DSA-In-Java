package Arrays;

public class removeDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4};
        int k = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[k] = arr[i];
                System.out.print(arr[k] + " ");
                k++;
            }
        }
        System.out.println(arr[arr.length-1]);
        System.out.println(k+1);
    }
}
