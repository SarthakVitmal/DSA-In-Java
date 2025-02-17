package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findThePrefixCommonArray {
    public static int[] prefixCommonArray(int[] arr,int[] brr){
        int n = arr.length;
        int[] ans = new int[n];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(arr[i]);
            setB.add(brr[i]);

            Set<Integer> commonSet = new HashSet<>(setA);
            System.out.println(commonSet.retainAll(setB));

            ans[i] = commonSet.size();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int[] brr = {3,1,4,2};
        int[] ans = prefixCommonArray(arr,brr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
