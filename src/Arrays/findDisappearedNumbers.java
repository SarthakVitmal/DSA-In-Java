package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = findDisappearedNos(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> findDisappearedNos(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        HashSet<Integer> arrEle = new HashSet<>();
        HashSet<Integer> allEle = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arrEle.add(arr[i]);
        }
        for (int i = 1; i <= n; i++) {
            allEle.add(i);
        }

        for (int ele : allEle) {
            if(!arrEle.contains(ele)) al.add(ele);
        }
        return al;
    }
}
