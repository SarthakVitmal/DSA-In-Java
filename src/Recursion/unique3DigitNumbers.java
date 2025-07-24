package Recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class unique3DigitNumbers {
    public static void main(String[] args) {
        int[] digits = {0,2,2};
        int ans = totalNumbers(digits);
        System.out.println(ans);
    }

    private static int totalNumbers(int[] digits) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if(i % 2 == 0){
                boolean ans = isPresent(i,digits);
                if(ans)count++;
            }
        }
        return count;
    }

    private static boolean isPresent(int num, int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            if(map.containsKey(digits[i]))map.put(digits[i],map.get(digits[i])+1);
            else map.put(digits[i],1);
        }
        while (num > 0){
            int rem = num % 10;
            if(map.containsKey(rem)){
                int freq = map.get(rem);
                if(freq == 1)map.remove(rem);
                else map.put(rem,freq-1);
            }else return false;
            num /= 10;
        }
        return true;
    }
}
