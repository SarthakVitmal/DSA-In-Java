package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
//        int[] arr1 = {4,9,5};
//        int[] arr2 = {9,4,9,8,4};
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
//                if(ans.isEmpty() || ans.get(ans.size()-1)!= arr1[i]){
//                    ans.add(arr1[i]);
//                }
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j])i++;
            else j++;
        }
        int[] res = new int[ans.size()];
        for (int m = 0; m < ans.size(); m++) {
            res[m] = ans.get(m);
            System.out.print(res[m] + " ");
        }
    }
}
