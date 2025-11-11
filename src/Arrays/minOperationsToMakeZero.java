package Arrays;

public class minOperationsToMakeZero {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2};
        int ans = minOperations(arr);
        System.out.println(ans);
    }

    private static int minOperations(int[] arr) {
        int count = 0;
        while (true){
            int i = 0, j = 0;
            while (i < arr.length && arr[i] == 0)i++;
            if(i == arr.length)break;
            j = i;
            while (j < arr.length && arr[j] != 0)j++;
            int min = Integer.MAX_VALUE;
            for (int k = i; k < j; k++) {
                min = Math.min(min,arr[k]);
            }
            for (int k = i; k < j; k++) {
                arr[k] -= min;
            }
            count++;
            i = j;
        }
        return count;
    }
}
