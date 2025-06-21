package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class countPrimeGapBalancedSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 1;
        int ans = primeSubarray(arr,k);
        System.out.println(ans);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    private static int primeSubarray(int[] arr, int k) {
        ArrayList<Integer> al;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            al = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                if(isPrime(arr[j]))al.add(arr[j]);
                if(al.size() >= 2){
                    int max = Collections.max(al);
                    int min = Collections.min(al);
                    if(max - min <= k)count++;
                }
            }
        }
        return count;
    }
}
