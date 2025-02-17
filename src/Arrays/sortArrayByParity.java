package Arrays;

import java.util.Arrays;

public class sortArrayByParity {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {6,2,3,5,4,1};
        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            if(arr[i] % 2 == 0)i++;
            else if(arr[j] % 2 == 1)j--;
            else if(arr[i]%2==1 && arr[j]%2==0){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
