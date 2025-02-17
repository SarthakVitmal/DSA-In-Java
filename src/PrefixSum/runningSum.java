package PrefixSum;

public class runningSum {
    public static int[] runningSumOfArray(int[] arr){
        if(arr.length == 1)return arr;
        for (int i = 1; i < arr.length; i++)arr[i] = arr[i] + arr[i-1];
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int[] res = runningSumOfArray(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
