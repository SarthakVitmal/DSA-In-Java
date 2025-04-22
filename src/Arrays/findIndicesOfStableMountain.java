package Arrays;

import java.util.ArrayList;

public class findIndicesOfStableMountain {
    public static void main(String[] args) {
        int[] arr = {10,1,10,1,10};
        int threshold = 3;
        ArrayList<Integer> al = stableMountains(arr,threshold);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    private static ArrayList<Integer> stableMountains(int[] arr, int threshold) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > threshold)ans.add(i);
        }
        return ans;
    }
}
