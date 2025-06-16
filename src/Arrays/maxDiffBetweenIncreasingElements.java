package Arrays;

public class maxDiffBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] arr = {1,5,2,10};
        int ans = maxDifference(arr);
        System.out.println(ans);
    }

    private static int maxDifference(int[] arr) {
        int maxDiff = -1;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    maxDiff = Math.max(maxDiff, arr[j]-arr[i]);
                }
            }
        }
        return maxDiff;
    }
}
