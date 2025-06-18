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
        int[][] empty = new int[0][0];
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length){
            al.add(arr[i]);
            if((i+1) % 3 == 0){
                if(al.get(2) - al.get(0) <= k){
                    ans.add(new ArrayList<>(al));
                    al.clear();
                }else return empty;
            }
            i++;
        }
        int[][] res = new int[ans.size()][3];
        for (int j = 0; j < ans.size(); j++) {
            for (int l = 0; l < 3; l++) {
                res[j][l] = ans.get(j).get(l);
            }
        }
        return res;
    }
}
