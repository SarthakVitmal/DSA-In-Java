package Arrays;

public class smallestCommonElement {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] brr = {2,4};
        int i = 0;
        int j = 0;
        while(i<arr.length && j<brr.length){
            if(arr[i] == brr[j]){
                System.out.println(arr[i]);
                break;
            }else if(arr[i] > arr[j])j++;
            else i++;
        }
    }
}
