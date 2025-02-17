package Arrays;

public class largestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] arr = {3,6,1,0};
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }
        boolean isLargest = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max && max < 2 * arr[i]){
                isLargest = false;
                break;
            }
        }
        if(isLargest) System.out.println(maxIdx);
        else System.out.println(-1);
    }
}
