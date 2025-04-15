package Hashmaps;

import java.util.ArrayList;

public class occurrenceOfElementInArray {
    public static void main(String[] args) {
        int[] nums = {1,3,1,7};
        int[] queries = {1,3,2,4};
        int x = 1;
        int[] ans = occurrencesOfElement(nums,queries,x);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] ans = new int[queries.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == x)al.add(i);
        }
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i] - 1;
            if(ifExistInArray(idx,al)){
                ans[i] = al.get(idx);
            }else ans[i] = -1;
        }
        return ans;
    }

    private static boolean ifExistInArray(int idx, ArrayList<Integer> al) {
        if(idx < al.size())return true;
        return false;
    }
}
