package SearchingAlgorithms;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40};
        int target = 30;
        int lowerBound = arr.length - 1;
        int upperBound = arr.length - 1;
        int low = 0;
        int high = arr.length - 1;
        int flag = 0;

        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                flag = 1;
                break;
            }else if(arr[mid] >= target) high = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
        }
        if(flag == 0)return;
        else {
            low = 0;
            high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] >= target) {
                    lowerBound = Math.min(lowerBound, mid);
                    high = mid - 1;
                } else low = mid + 1;
            }
        }
        if(flag == 0)return;
        else {
            low = 0;
            high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] > target) {
                    upperBound = Math.min(upperBound, mid);
                    high = mid - 1;
                } else low = mid + 1;
            }
        }
        System.out.println("First Position : "+lowerBound);
        System.out.println("Last Position : "+(upperBound-1));
    }
}
