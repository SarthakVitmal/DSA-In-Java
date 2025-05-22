package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> ans = findThreeSum(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<ArrayList<Integer>> findThreeSum(int[] arr) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            if(i > 0 &&  arr[i] == arr[i-1])continue;
            int left = i+1; int right = arr.length-1;
            while (left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    al.add(new ArrayList<> (Arrays.asList(arr[i],arr[left],arr[right])));
                    while (left < right && arr[left] == arr[left+1])left++;
                    while (left < right && arr[right] == arr[right-1])right--;
                    left++;right--;
                }
                else if(sum < 0)left++;
                else right--;
            }
        }
        return al;
    }
}
