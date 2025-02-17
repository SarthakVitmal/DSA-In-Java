package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class relativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17}; // 6 8 17 22 28 44
        int[] arr2 = {22,28,8,6};// 6 8 22 28
        int[] ans = new int[arr1.length];
        ArrayList<Integer> missingElements = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < arr2.length; i++) {
            int curr = arr2[i];
            int countCurrent = 0;
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j] == curr)countCurrent++;
            }
            for (int j = 0; j < countCurrent; j++) {
                ans[k++] = arr2[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                missingElements.add(arr1[i]);
            }
        }

        int[] missingArr = missingElements.stream().mapToInt(i -> i).toArray();
        Arrays.sort(missingArr);

        for (int i = 0; i < missingArr.length; i++) {
            ans[k++] = missingArr[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
