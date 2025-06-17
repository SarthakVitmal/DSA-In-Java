package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class unionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = {2,3,5,7};
        int[] ans = union(arr1,arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr1)set.add(ele);
        for (int ele : arr2)set.add(ele);
        ArrayList<Integer> al = new ArrayList<>(set);
        Collections.sort(al);
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
