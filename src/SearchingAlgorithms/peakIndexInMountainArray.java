package SearchingAlgorithms;

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,20,10};
        int low = 1;
        int high = arr.length - 2;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                System.out.println("Peak Index : "+mid);
                break;
            }else if(arr[mid] < arr[mid+1]) low = mid + 1;
            else if(arr[mid] > arr[mid+1]) high = mid - 1;
        }
    }
}
