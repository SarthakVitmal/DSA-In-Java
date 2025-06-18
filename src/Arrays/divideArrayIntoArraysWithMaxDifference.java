package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class divideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int[] arr = {2,4,2,2,5,2};
        int k = 2;
        int[][] ans = divideArray(arr,k);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
        }
    }

    private static int[][] divideArray(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] res2 = new int[0][0];
        ArrayList<Integer> al;
        Arrays.sort(arr);
        int i = 0;
        al = new ArrayList<>();
        while (i < arr.length){
            al.add(arr[i]);
            if((i+1) % 3 == 0){
                if((al.get(0) - al.get(1) <= k && al.get(1) - al.get(0) <= k) && (al.get(1) - al.get(2) <= k && al.get(2) - al.get(1) <= k) && (al.get(0) - al.get(2) <= k && al.get(2) - al.get(0) <= k)){
                    ans.add(al);
                    al = new ArrayList<>();
                }else return res2;
            }
            i++;
        }
        int[][] res = new int[ans.size()][ans.get(0).size()];
        for (int j = 0; j < ans.size(); j++) {
            for (int l = 0; l < ans.get(j).size(); l++) {
                res[j][l] = ans.get(j).get(l);
            }
        }
        return res;
    }
}
