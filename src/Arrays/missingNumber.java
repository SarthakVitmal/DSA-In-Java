package Arrays;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,2};
        Arrays.sort(arr);
        int n = arr.length;
        int[] brr = new int[arr.length+1];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = i;
        }
        int i = 0;
        int j = 0;
        while (j<brr.length){
            if(i<arr.length && arr[i] != brr[j]){
                System.out.println("Missing Element : "+brr[j]);
                break;
            }
            else if(i>=arr.length){
                System.out.println("Missing Element : "+brr[j]);
                break;
            }
            else{
                i++;
                j++;
            }
        }

    }
}
