package SearchingAlgorithms;

public class searchInRotatedArray {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target)return mid;
            else if(arr[mid] <= arr[high]){//I am right sorted array
                if(arr[mid] < target && target <= arr[high]) low = mid + 1;//mid to high is sorted
                else high = mid - 1;
            }
            else if(arr[mid] >= arr[high]){//I am left sorted array
                if(arr[low] <= target && target <= arr[mid]) high = mid - 1; //low to mid is sorted
                else low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,1,2,3};
        int target = 5;
        int res = search(arr,target);
        if(res != -1) System.out.println("Element Found");
        else System.out.println("Element Not Found");

    }
}
