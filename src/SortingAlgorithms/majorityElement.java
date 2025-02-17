package SortingAlgorithms;
import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,4,4};
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j>=1 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        int n = arr.length/2;
        System.out.println("Majority Element : "+arr[n]);
    }
}
