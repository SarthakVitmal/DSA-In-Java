package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class arithmeticSubarrays {
    public static void main(String[] args) {
        int[] arr = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};

        ArrayList<Boolean> ans = checkArithmeticSubarrays(arr,l,r);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Boolean> checkArithmeticSubarrays(int[] arr, int[] l, int[] r) {
        ArrayList<Boolean> al = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int start = l[i], end = r[i];
            int[] temp = new int[end-start+1];
            for (int j = start; j <= end; j++) {
                temp[j-start] = arr[j];
            }
            Arrays.sort(temp);
            int diff = temp[1] - temp[0];
            boolean isDiff = true;
            for (int j = 1; j < temp.length-1; j++) {
                if(temp[j+1] - temp[j] != diff){
                    isDiff = false;
                    break;
                }
            }
            if(isDiff)al.add(true);
            else al.add(false);
        }
        return al;
    }
}
