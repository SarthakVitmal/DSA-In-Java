package Hashmaps;

import java.util.TreeSet;

public class thirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int ans = thirdMax(arr);
        System.out.println(ans);
    }

    private static int thirdMax(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            if(set.size() > 3)set.pollFirst();
        }
        if(set.size() < 3){
            return set.last();
        }
        return set.first();
    }
}
