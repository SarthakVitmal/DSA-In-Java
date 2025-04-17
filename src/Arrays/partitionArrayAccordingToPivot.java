package Arrays;

import java.util.ArrayList;

public class partitionArrayAccordingToPivot {
    public static void main(String[] args) {
        int[] arr = {-3,4,3,2};
        int pivot = 2;
        int[] ans = pivotArray(arr, pivot);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] pivotArray(int[] arr, int pivot) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int j : arr) {
            if (j < pivot) al.add(j);
        }
        for (int j : arr) {
            if (j == pivot) al.add(j);
        }
        for (int j : arr) {
            if (j > pivot) al.add(j);
        }
        return al.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void printList(ArrayList<Integer> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
    }
}
