package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class maxPrimeDifference {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int ans = maxDiff(arr);
        System.out.println(ans);
    }

    private static int maxDiff(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = checkPrime(arr[i]);
            if(isPrime)al.add(i);
        }
        if(al.isEmpty() || al.size() == 1)return 0;
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        Arrays.sort(ans);
        return ans[ans.length-1]-ans[0];
    }

    private static boolean checkPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
}
