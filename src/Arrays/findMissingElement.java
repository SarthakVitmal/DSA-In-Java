package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class findMissingElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5};
        ArrayList<Integer> al = findMissing(arr);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    private static ArrayList<Integer> findMissing(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max,arr[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if(!set.contains(i))al.add(i);
        }
        return al;
    }
}
