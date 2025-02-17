package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1, 1};
        int[] freq = new int[arr.length + 1];
        ArrayList<Integer> al = new ArrayList<>();

        for (int nums : arr) freq[nums]++;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) al.add(i);
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
