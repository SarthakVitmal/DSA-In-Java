package Recursion;

import java.util.ArrayList;

public class subsetsArray {
    static ArrayList<ArrayList<Integer>> arr;
    public static void helper(int i,int[] nums,ArrayList<Integer> ans){
        if(i == nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < ans.size(); j++) {
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans);
        ans.add(nums[i]);
        helper(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums){
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0,nums,ans);
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ArrayList<ArrayList<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}
