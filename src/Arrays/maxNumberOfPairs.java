package Arrays;

import java.util.ArrayList;
import java.util.Objects;

public class maxNumberOfPairs {
    public static int[] numberOfPairs(int[] nums){
        int[] ans = new int[2];
        if(nums.length <= 1){
            ans[0] = 0;
            ans[1] = nums.length;
            return ans;
        }
        ArrayList<Integer> al = new ArrayList<>();
        int countPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            al.add(nums[i]);
        }
        for (int i = 0; i < al.size(); i++) {
            for (int j = i+1; j < al.size(); j++) {
                if(Objects.equals(al.get(i), al.get(j))){
                    al.remove(j);
                    al.remove(i);
                    countPairs++;
                    i--;
                    break;
                }
            }
        }
        ans[0] = countPairs;
        ans[1] = al.size();
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = numberOfPairs(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
