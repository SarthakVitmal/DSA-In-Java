package Arrays;

import java.util.Scanner;

public class sortOsand1sMethodone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,0,0,1,1,0,1,0,0,1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
