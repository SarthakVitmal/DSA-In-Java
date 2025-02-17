package Arrays;

import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int []rotatedarray = new int[n];

        System.out.println("Enter the number of steps : ");
        int k = sc.nextInt();

        for(int i=0;i<n;i++){
            int rotatedIndex = (i + k) % n;
            rotatedarray[rotatedIndex] = arr[i];
        }

        System.out.println("Rotated Array");
        for(int i=0;i<n;i++){
            System.out.print(rotatedarray[i] + " ");
        }

    }
}
