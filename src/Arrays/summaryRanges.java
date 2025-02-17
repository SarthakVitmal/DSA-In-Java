package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class summaryRanges {
    public static ArrayList<String> summaryRange(int[] arr){
        int n = arr.length;
        ArrayList<String> al = new ArrayList<>();
        if(n==0){
            return al;
        }
        int i = 0; int j = i+1; int k = 0;

        while (j<n){
            if(arr[j] == arr[k]+1){
                j++;
                k++;
            }else{
                if(i == k){
                    al.add(String.valueOf(arr[i]));
                }else{
                    al.add(arr[i]+"->"+arr[k]);
                }
                i=j;
                k=j;
                j++;
            }
        }
        if(i == k){
            al.add(String.valueOf(arr[i]));
        }else{
            al.add(arr[i]+"->"+arr[k]);
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {};
        ArrayList<String> al = summaryRange(arr);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
