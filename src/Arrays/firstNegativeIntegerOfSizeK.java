package Arrays;

import java.util.ArrayList;

public class firstNegativeIntegerOfSizeK {
    public static long[] printFirstNegativeInteger(long[] arr,int n,int k){
        ArrayList<Long> al = new ArrayList<>();
        int i = 0;
        while (i <= n - k){
            boolean found = false;
            for (int j = i; j < i+k; j++) {
                if(arr[j] < 0){
                    al.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if(!found)al.add(0L);
            i++;
        }
        long[] ans = new long[al.size()];
        for (int j = 0; j < al.size(); j++) {
            ans[j] = al.get(j);
        }
        return ans;
    }
    public static void main(String[] args) {
        long[] arr = {12,-1,-7,8,-15,30,16,28};
        int n = arr.length;
        int k = 3;
        long[] res = printFirstNegativeInteger(arr,n,k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
