package Arrays;

//leetcode - 3423. Maximum Difference Between Adjacent Elements in a Circular Array
public class maxDiffBetweenAdjElements {
    public static void main(String[] args) {
        int[] arr = {2,1,0};
        int diff = maxAdjacentDistance(arr);
        System.out.println(diff);
    }

    private static int maxAdjacentDistance(int[] arr) {
        int maxDiff = Integer.MIN_VALUE;
        int i=0; int j=1;
        while (j<arr.length){
            int diff = Math.abs(arr[i] - arr[j]);
            maxDiff = Math.max(maxDiff,diff);
            i++;
            j++;
        }
        int lastDiff = Math.abs(arr[arr.length-1] - arr[0]);
        maxDiff = Math.max(maxDiff,lastDiff);
        return maxDiff;
    }
}
