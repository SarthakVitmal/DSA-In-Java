package Hashmaps;

import java.util.HashSet;

public class smallestIntegerDivByK {
    public static void main(String[] args) {
        int k = 2;
        int ans = smallestRepunitDivByK(k);
        System.out.println(ans);
    }

    private static int smallestRepunitDivByK(int k) {
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder("1");
        int rem = 1 % k;
        while (rem != 0){
            rem =  (rem * 10 + 1) % k;
            if(rem != 0){
                if(set.contains(rem))return -1;
                else{
                    set.add(rem);
                    sb.append(1);
                }
            }
        }
        return sb.length();
    }
}
