package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        System.out.println("Enter the element to be search : ");
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++) {
            if (x == arr[i]) {
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println("Element Found");
        else System.out.println("Element Not Found");
    }
}
