package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class checkPalindromic {
    public static boolean checkPalindrom(int[] ans){
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : ans) {
            al.add(num);
        }
        ArrayList<Integer> reversed = new ArrayList<>(al);
        Collections.reverse(reversed);
        return al.equals(reversed);
    }
    public static int[] decimalToBinary(int n){
        int[] binary = new int[32];
        int i = 0;
        while(n > 0){
            binary[i] = n % 2;
            n = n / 2;
            i++;
        }
        return binary;
    }
    public static void main(String[] args) {
        int n = 4;
        int []ans = decimalToBinary(n);
        boolean res =  checkPalindrom(ans);
        System.out.println(res);
    }
}
