package Arrays;

public class reverseArray {

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int i = 0;
        int n = arr.length;
        int j = n - 1;
        int temp;

        while (i <= j) {
            swap(arr,i,j);
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
