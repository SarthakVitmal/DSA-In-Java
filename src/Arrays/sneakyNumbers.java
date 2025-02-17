package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class sneakyNumbers {
    public static void main(String[] args) {
        int[] nums = {0,3,2,1,3,2};
        int[] ans = getSneakyNumbers(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq+1);
            }else map.put(nums[i],1);
        }
        for(int freq: map.keySet()){
            if(map.get(freq) == 2)al.add(freq);
        }
        System.out.println(map);
        int[] ans = new int[al.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
