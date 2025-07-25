package Hashmaps;

import java.util.ArrayList;
import java.util.HashSet;

public class maximumUniqueSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,1,0,-1};
        int ans = maxSum(arr);
        System.out.println(ans);
    }

    private static int maxSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(ele >= 0)set.add(ele);
        }
        ArrayList<Integer> al = new ArrayList<>(set);
        int sum = 0;
        for (Integer integer : al) {
            sum += integer;
        }
        return sum;
    }
}
