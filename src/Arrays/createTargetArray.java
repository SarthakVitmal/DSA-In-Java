package Arrays;

import java.util.ArrayList;

public class createTargetArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = targetArray(arr,index);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] targetArray(int[] arr, int[] index) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int idx = index[i];
            al.add(idx,arr[i]);
        }
        return  al.stream().mapToInt(Integer::intValue).toArray();
    }
}
