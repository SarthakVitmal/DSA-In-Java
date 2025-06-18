package Heaps;
import java.util.Arrays;
import java.util.PriorityQueue;

public class deleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{3,3,1}};
        int ans = deletedGreatestValue(arr);
        System.out.println(ans);
    }

    private static int deletedGreatestValue(int[][] arr) {
        for(int[] row : arr){
            Arrays.sort(row);
        }
        int total = 0;
        int m = arr.length; int n = arr[0].length;
        for (int col = n-1; col >= 0; col--) {
            int max = 0;

            for (int row = 0; row < m; row++) {
                max = Math.max(max, arr[row][col]);
            }
            total += max;
        }
        return total;
    }
}
