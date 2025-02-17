package SearchingAlgorithms;

public class lowerBound {
    public static int min(int a,int b){
        return Math.min(a, b);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 85;
        int lowerBound = arr.length - 1;
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = (low + high)/ 2;
            if(arr[mid] >= target){
                lowerBound = min(lowerBound,mid);
                high = mid - 1;
            }else low = mid + 1;
        }
        System.out.println(lowerBound);
    }
}
