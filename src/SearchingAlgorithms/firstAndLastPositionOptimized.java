package SearchingAlgorithms;

public class firstAndLastPositionOptimized {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40};
        int low = 0;
        int high = arr.length - 1;
        int lb = arr.length - 1;
        int ub = arr.length - 1;
        int target = 40;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                if(mid > 0 && arr[mid] == arr[mid-1]) high = mid - 1;
                else {
                    lb = mid;
                    break;
                }
            }
            else if(arr[mid] > target)high = mid - 1;
            else if(arr[mid] < target)low = mid + 1;
        }
        System.out.println("Lowerbound : "+lb);
        low = 0; high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                if(mid+1 < arr.length && arr[mid] == arr[mid+1]) low = mid +   1;
                else {
                    ub = mid;
                    break;
                }
            }
            else if(arr[mid] > target)high = mid - 1;
            else if(arr[mid] < target)low = mid + 1;
        }
        System.out.println("Upperbound : "+ub);
    }
}
