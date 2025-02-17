package Arrays;

public class monotonicArray {
    public static boolean monotonicArr(int[] arr){
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1])isDecreasing = false;
            if(arr[i] < arr[i-1])isIncreasing = false;
        }
        return isIncreasing || isDecreasing;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0};
        boolean result = monotonicArr(arr);
        if(result) System.out.println(true);
        else System.out.println(false);
    }
}
