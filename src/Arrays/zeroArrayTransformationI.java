package Arrays;

public class zeroArrayTransformationI {
    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1};
        int[][] queries = {{0,2}};
        boolean zeroArray = isZeroArray(arr,queries);
        System.out.println(zeroArray);
    }

    private static boolean isZeroArray(int[] arr, int[][] queries) {
        /*
        Brute force approach
        for (int i = 0; i < queries.length; i++) {
            int[] temp = queries[i];
            int start = temp[0];
            int end = temp[1];
            for (int j = start; j <= end; j++) {
                if(arr[j] != 0) arr[j] = arr[j] - 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0)return false;
        }
        return true;
         */

        //Difference Array and Prefix Sum Approach
        int[] diff = new int[arr.length+1];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            diff[start] += 1;
            if (end+1 < arr.length+1) {
                diff[end + 1] -= 1;
            }
        }
        //Prefix Sum
        for (int i = 1; i < diff.length; i++) {
            diff[i] += diff[i-1];
        }
        print(arr);
        print(diff);
        //Diff of original and diff array
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - diff[i] >= 0)temp[i] = arr[i] - diff[i];
            if(temp[i] != 0)return false;
            else temp[i] = arr[i];
        }

        return true;
    }
}
