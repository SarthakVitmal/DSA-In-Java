package Arrays;

public class mergeTwoSortedArrays_MethodTwo {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int[] brr = {1,3,5,7};
        int[] crr = new int[arr.length + brr.length];
        int i = arr.length - 1;
        int j = brr.length - 1;
        int k = crr.length - 1;

        while(i>=0 && j>=0){
            if(arr[i] > arr[j]){
                crr[k] = arr[i];
                i--;
                k--;
            }else if(arr[i]<brr[j]){
                crr[k] = brr[j];
                j--;
                k--;
            }
        }
        if(i == 0){
            while(j>=0){
                crr[k] = brr[j];
                j--;
                k--;
            }
        }
        if(j == 0){
            while(i>=0){
                crr[k] = arr[i];
                i--;
                k--;
            }
        }
        for(int ele : crr){
            System.out.print(ele + " ");
        }
    }
}
