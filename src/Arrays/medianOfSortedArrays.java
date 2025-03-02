package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class medianOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        double ans = findMedianSortedArrays(arr1,arr2);
        System.out.println(ans);
    }

    private static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            al.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            al.add(arr2[i]);
        }
        Collections.sort(al);
        if(al.size() % 2 == 0)return (double) (al.get(al.size() / 2) + al.get((al.size() / 2) - 1)) /2;
        return al.get(al.size() / 2);
    }
}
