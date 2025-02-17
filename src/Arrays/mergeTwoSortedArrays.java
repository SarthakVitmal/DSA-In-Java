package Arrays;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7};
        int[] brr = {1,4,6,8};
        int[] crr = new int[arr.length + brr.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr.length && j<brr.length){
        if(arr[i] < brr[j]) {
            crr[k] = arr[i];
            i++;
        } else if(arr[i] > brr[j]){
            crr[k] = brr[j];
            j++;
        }
        k++;
        }
        if(i == arr.length){ // now take elements from brr only
            while(j < brr.length){
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        else if(j == brr.length){ // now take elements from arr only
            while(i < arr.length){
                crr[k] = arr[i];
                i++;
                k++;
            }
        }
        for(int ele : crr) System.out.print(ele + " ");
    }
}
