package Arrays;

public class runningSum {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int res = 0;
        for (int i = 0; i < arr.length-1; i++) {
            res = arr[i] + arr[i+1];
            arr[i+1] = res;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
