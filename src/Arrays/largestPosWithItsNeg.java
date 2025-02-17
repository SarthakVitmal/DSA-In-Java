package Arrays;

import java.util.ArrayList;

public class largestPosWithItsNeg {
    public static int findMaxK(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == -1 * arr[j]){
                    al.add(arr[i]);
                }
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ans.length; i++) {
            if(max < ans[i])max = ans[i];
        }
        if(max == Integer.MIN_VALUE)return -1;
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-10,8,6,7,-2,-3};
        int res = findMaxK(arr);
        System.out.println(res);
    }
}
