package Arrays;

public class findPeakElement {
    public static void main(String[] args) {
        int[] arr = {1};
        int idx = findPeak(arr);
        System.out.println(idx);
    }

    private static int findPeak(int[] arr) {
//        int low = 0;
//        int high = arr.length - 1;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1]))return mid;
//            else if (mid > 0 && arr[mid] < arr[mid - 1])high = mid - 1;//Move left
//            else low = mid + 1;
//        }
//        return -1;

        int n = arr.length-1;
        int low = 0; int high = n;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == n || arr[mid] > arr[mid+1]))return mid;
            else if(mid > 0 && arr[mid] < arr[mid-1])high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
