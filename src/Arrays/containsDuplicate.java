package Arrays;

import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int []arr = {3,4,5,6,6};
        int flag = 0;

        Arrays.sort(arr);
        int i = 0;
        while(i<arr.length-1) {
            if (arr[i] == arr[i + 1]) {
                flag = 1;
                break;
            } else {
                flag = 0;
                i++;
            }
        }

        if(flag == 1) System.out.println("Duplicate exist");
        else System.out.println("Duplicate don't exist");
    }
}
