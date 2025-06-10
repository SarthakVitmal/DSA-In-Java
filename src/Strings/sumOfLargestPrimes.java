package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class sumOfLargestPrimes {
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "12234";
        long ans = sumOfLargePrimes(s);
        System.out.println(ans);
    }

    private static long sumOfLargePrimes(String s) {
        StringBuilder sb;
        HashSet<Long> set = new HashSet<>();
        int i = 0;
        while (i < s.length()){
            sb = new StringBuilder();
            sb.append(s.charAt(i));
            long num = Long.parseLong(sb.toString());
            if(isPrime(num)){
                set.add(num);
            }
            int j = i + 1;
            while (j < s.length()){
                sb.append(s.charAt(j));
                num = Long.parseLong(sb.toString());
                if(isPrime(num)){
                    set.add(num);
                }
                j++;
            }
            i++;
        }
        ArrayList<Long> al = new ArrayList<>(set);
        Collections.sort(al);
        int sum = 0;
        if(al.size() <= 3){
            for (int j = 0; j < al.size(); j++) {
                sum += al.get(j);
            }
            return sum;
        }
        return al.get(al.size()-1) + al.get(al.size()-2) + al.get(al.size()-3);
    }
}
