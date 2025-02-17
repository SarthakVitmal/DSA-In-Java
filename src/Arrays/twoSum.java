package Arrays;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,2,4,6,7,8,9};
        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        int flag = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    flag = 1;
                    System.out.println("Doublets are " +arr[i]+ " and " +arr[j]);
                }
            }
        }
        if(flag == 0) System.out.println("No doublet pairs of elements found whose sum is equal to target value.");
    }
}
