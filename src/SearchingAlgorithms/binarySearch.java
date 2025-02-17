package SearchingAlgorithms;

public class binarySearch {
    public static int binarySearch(int[] arr,int target,int mid){
        int flag = 0;
        int low = 0;
        int high = arr.length - 1;
        while(low<=high) {
            mid = (low + high )/ 2;
            if (target > arr[mid]) low = mid + 1;
            else if (target < arr[mid]) high = mid - 1;
            else if (target == arr[mid]) {
                flag = 1;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,17,22,30,45,80,98,100};
        int mid = arr.length/2;
        int target = 6;
        int result = binarySearch(arr,target,mid);

        if(result == 1) System.out.println("Element Found");
        else System.out.println("Element Not Found");
    }
}
