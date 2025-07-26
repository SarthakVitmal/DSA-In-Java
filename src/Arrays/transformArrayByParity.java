package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class transformArrayByParity {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] ans = transformArray(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }

    private static int[] transformArray(int[] arr) {
        int countZeroes = 0, countOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)countZeroes++;
            else countOnes++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < countZeroes; i++) al.add(0);
        for (int i = 0; i < countOnes; i++) al.add(1);
        arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
}
