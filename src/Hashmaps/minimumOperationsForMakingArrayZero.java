package Hashmaps;

import java.util.HashSet;

public class minimumOperationsForMakingArrayZero {
    public static void main(String[] args) {
        int[] arr = {1,5,0,3,5};
        int ans = minimumOperations(arr);
        System.out.println(ans);
    }

    private static int minimumOperations(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(ele != 0)set.add(ele);
        }
        return set.size();
    }
}
