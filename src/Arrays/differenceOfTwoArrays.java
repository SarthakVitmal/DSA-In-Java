package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class differenceOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        int[] brr = {1,1,2,2};
        ArrayList<ArrayList<Integer>> ans = findDifference(arr,brr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<ArrayList<Integer>> findDifference(int[] arr, int[] brr) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map1.put(arr[i],i);
        }
        for (int i = 0; i < brr.length; i++) {
            map2.put(brr[i],i);
        }
        for(Integer key : map1.keySet()){
            if(!map2.containsKey(key))al1.add(key);
        }
        for (Integer key : map2.keySet()) {
            if (!map1.containsKey(key))al2.add(key);
        }
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(al1);
        al.add(al2);

        return al;
    }
}
