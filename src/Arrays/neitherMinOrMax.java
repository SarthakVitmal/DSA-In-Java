package Arrays;

public class neitherMinOrMax {
    public static int neitherMinNorMax(int[] arr){
        if(arr.length <= 2)return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])max = arr[i];
            if(min > arr[i]) min = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max && arr[i] != min){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1};
        int res = neitherMinNorMax(arr);
        System.out.println(res);
    }
}
