package Arrays;

import java.util.HashMap;

public class checkPrimeFrequency {
    public static void main(String[] args) {
        int[] arr = {2,2,2,4,4};
        boolean ans = checkPrime(arr);
        System.out.println(ans);
    }

    private static boolean checkPrime(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele))map.put(ele, map.get(ele)+1);
            else map.put(ele,1);
        }
        for(int value : map.values()){
            if(isPrime(value))return true;
        }
        return false;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
